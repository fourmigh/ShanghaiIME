package org.caojun.ime.shanghai

import android.inputmethodservice.InputMethodService
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.LinearLayout
import com.socks.library.KLog
import org.caojun.ime.shanghai.hanzi.Pinyin2Hanzi
import org.caojun.ime.shanghai.hanzi.PinyinEnum

class ShanghaiIME : InputMethodService() {

    private val pinyin = StringBuilder()

    override fun onCreateInputView(): View {
        val inputView = layoutInflater.inflate(R.layout.input_view, null)

        // 在这里设置 TextWatcher 或其他监听器来获取输入内容
        val editText = inputView.findViewById<EditText>(R.id.editText)
        editText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        val switchToPinyin = inputView.findViewById<Button>(R.id.switchToPinyin)
        val switchToBihua = inputView.findViewById<Button>(R.id.switchToBihua)
        val pinyinKeyboard = inputView.findViewById<LinearLayout>(R.id.pinyinKeyboard)
        val bihuaKeyboard = inputView.findViewById<LinearLayout>(R.id.bihuaKeyboard)
        switchToPinyin.setOnClickListener {
            pinyinKeyboard.visibility = View.VISIBLE
            bihuaKeyboard.visibility = View.GONE
        }
        switchToBihua.setOnClickListener {
            pinyinKeyboard.visibility = View.GONE
            bihuaKeyboard.visibility = View.VISIBLE
        }

        val candidateContainer = inputView.findViewById<LinearLayout>(R.id.candidateContainer)
        val btnPinyinA = inputView.findViewById<Button>(R.id.btnPinyinA)
        val btnPinyinB = inputView.findViewById<Button>(R.id.btnPinyinB)
        val btnPinyinC = inputView.findViewById<Button>(R.id.btnPinyinC)
        val btnPinyinD = inputView.findViewById<Button>(R.id.btnPinyinD)
        val btnPinyinE = inputView.findViewById<Button>(R.id.btnPinyinE)
        val btnPinyinF = inputView.findViewById<Button>(R.id.btnPinyinF)
        val btnPinyinG = inputView.findViewById<Button>(R.id.btnPinyinG)
        val btnPinyinH = inputView.findViewById<Button>(R.id.btnPinyinH)
        val btnPinyinI = inputView.findViewById<Button>(R.id.btnPinyinI)
        val btnPinyinJ = inputView.findViewById<Button>(R.id.btnPinyinJ)
        val btnPinyinK = inputView.findViewById<Button>(R.id.btnPinyinK)
        val btnPinyinL = inputView.findViewById<Button>(R.id.btnPinyinL)
        val btnPinyinM = inputView.findViewById<Button>(R.id.btnPinyinM)
        val btnPinyinN = inputView.findViewById<Button>(R.id.btnPinyinN)
        val btnPinyinO = inputView.findViewById<Button>(R.id.btnPinyinO)
        val btnPinyinP = inputView.findViewById<Button>(R.id.btnPinyinP)
        val btnPinyinQ = inputView.findViewById<Button>(R.id.btnPinyinQ)
        val btnPinyinR = inputView.findViewById<Button>(R.id.btnPinyinR)
        val btnPinyinS = inputView.findViewById<Button>(R.id.btnPinyinS)
        val btnPinyinT = inputView.findViewById<Button>(R.id.btnPinyinT)
        val btnPinyinU = inputView.findViewById<Button>(R.id.btnPinyinU)
        val btnPinyinV = inputView.findViewById<Button>(R.id.btnPinyinV)
        val btnPinyinW = inputView.findViewById<Button>(R.id.btnPinyinW)
        val btnPinyinX = inputView.findViewById<Button>(R.id.btnPinyinX)
        val btnPinyinY = inputView.findViewById<Button>(R.id.btnPinyinY)
        val btnPinyinZ = inputView.findViewById<Button>(R.id.btnPinyinZ)
        val btnPinyin = arrayOf(btnPinyinA, btnPinyinB, btnPinyinC, btnPinyinD, btnPinyinE,
            btnPinyinF, btnPinyinG, btnPinyinH, btnPinyinI, btnPinyinJ, btnPinyinK, btnPinyinL,
            btnPinyinM, btnPinyinN, btnPinyinO, btnPinyinP, btnPinyinQ, btnPinyinR, btnPinyinS,
            btnPinyinT, btnPinyinU, btnPinyinV, btnPinyinW, btnPinyinX, btnPinyinY, btnPinyinZ)
        for (button in btnPinyin) {
            button.setOnClickListener {
                pinyin.append(button.text)
                showCandidates(candidateContainer)
            }
        }

        val ibDelete = inputView.findViewById<ImageButton>(R.id.ibDelete)
        ibDelete.setOnClickListener {
            if (pinyin.isEmpty()) {
                return@setOnClickListener
            }
            pinyin.deleteCharAt(pinyin.length - 1)
            showCandidates(candidateContainer)
        }
        ibDelete.setOnLongClickListener {
            if (pinyin.isNotEmpty()) {
                pinyin.clear()
                showCandidates(candidateContainer)
            }
            true
        }

        initPinyin()

        return inputView
    }

    private fun initPinyin() {
        for (pinyin in PinyinEnum.values()) {
            val shenmu = pinyin.shengmu
            val yunmu = pinyin.yunmu
            KLog.d("Pinyin", "PinyinEnum: ${formatEnum(pinyin)} = ${formatEnum(shenmu)}${formatEnum(yunmu)}")
        }
        for (ph in Pinyin2Hanzi.pinyin2Hanzi.entries) {
            KLog.d("Pinyin", "Pinyin2Hanzi: ${formatEnum(ph.key)} = ${ph.value.toList()}")
        }
    }
    private fun formatEnum(enum: Enum<*>?): String {
        if (enum == null) {
            return ""
        }
        if (enum.name.startsWith("_")) {
            return enum.name.substring(1)
        }
        return enum.name
    }

//    private fun getChineseFromPinyin(pinyin: String): List<String> {
//        val pinyinList = BasePinyinHelper.
//        val chineseList = HanLP.convertPinyinToChinese(pinyinList)
//        return chineseList
//    }

    private fun showCandidates(candidateContainer: LinearLayout) {
        val pinyins = PinyinEnum.values()
        val candidates = ArrayList<String>()
//        val candidates = pinyinToChineseMap[pinyin]
        candidateContainer.removeAllViews()
        for (py in pinyins) {
            val pinyinFormat = formatEnum(py)
            if (pinyinFormat.startsWith(pinyin)) {
                candidates.add(pinyinFormat)
            }
        }
        if (candidates.isNotEmpty()) {
            candidates.forEach { candidate ->
                val candidateButton = Button(this)
                candidateButton.text = candidate
                candidateButton.setOnClickListener {
                    pinyin.clear() // 清空拼音输入
                    candidateContainer.removeAllViews() // 清除候选字
                }
                candidateContainer.addView(candidateButton)
            }
        }
    }
}