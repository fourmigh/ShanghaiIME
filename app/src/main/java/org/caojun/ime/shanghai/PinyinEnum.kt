package org.caojun.ime.shanghai

enum class PinyinEnum(val shengmu: ShengMu?, val yunmu: YunMu) {
    a(null, YunMu.a), o(null, YunMu.o), e(null, YunMu.e), i(null, YunMu.i), u(null, YunMu.u), ü(null, YunMu.ü),
    ai(null, YunMu.ai), ei(null, YunMu.ei), ui(null, YunMu.ui), ao(null, YunMu.ao), ou(null, YunMu.ou), iu(null, YunMu.iu), ie(null, YunMu.ie), üe(null, YunMu.üe), er(null, YunMu.er),
    an(null, YunMu.an), en(null, YunMu.en), _in(null, YunMu._in), un(null, YunMu.un), ün(null, YunMu.ün),
    ang(null, YunMu.ang), eng(null, YunMu.eng), ing(null, YunMu.ing), ong(null, YunMu.ong),
    ba(ShengMu.b, YunMu.a), bo(ShengMu.b, YunMu.o), bi(ShengMu.b, YunMu.i), bu(ShengMu.b, YunMu.u),
    bai(ShengMu.b, YunMu.ai), bei(ShengMu.b, YunMu.ei), bao(ShengMu.b, YunMu.ao), bie(ShengMu.b, YunMu.ie),
    ban(ShengMu.b, YunMu.an), ben(ShengMu.b, YunMu.en), bin(ShengMu.b, YunMu._in),
    bang(ShengMu.b, YunMu.ang), beng(ShengMu.b, YunMu.eng), bing(ShengMu.b, YunMu.ing),
    bian(ShengMu.b, YunMu.ian), biao(ShengMu.b, YunMu.iao),
    pa(ShengMu.p, YunMu.a), po(ShengMu.p, YunMu.o), pi(ShengMu.p, YunMu.i), pu(ShengMu.p, YunMu.u),
    pai(ShengMu.p, YunMu.ai), pei(ShengMu.p, YunMu.ei), pao(ShengMu.p, YunMu.ao), pou(ShengMu.p, YunMu.ou), pie(ShengMu.p, YunMu.ie),
    pan(ShengMu.p, YunMu.an), pen(ShengMu.p, YunMu.en), pin(ShengMu.p, YunMu._in),
    pang(ShengMu.p, YunMu.ang), peng(ShengMu.p, YunMu.eng), ping(ShengMu.p, YunMu.ing),
    pian(ShengMu.p, YunMu.ian), piao(ShengMu.p, YunMu.iao),
    ma(ShengMu.m, YunMu.a), mo(ShengMu.m, YunMu.o), me(ShengMu.m, YunMu.e), mi(ShengMu.m, YunMu.i), mu(ShengMu.m, YunMu.u),
    mai(ShengMu.m, YunMu.ai), mei(ShengMu.m, YunMu.ei), mao(ShengMu.m, YunMu.ao), mou(ShengMu.m, YunMu.ou), miu(ShengMu.m, YunMu.iu), mie(ShengMu.m, YunMu.ie),
    man(ShengMu.m, YunMu.an), men(ShengMu.m, YunMu.en), min(ShengMu.m, YunMu._in),
    mang(ShengMu.m, YunMu.ang), meng(ShengMu.m, YunMu.eng), ming(ShengMu.m, YunMu.ing),
    mian(ShengMu.m, YunMu.ian), miao(ShengMu.m, YunMu.iao),
    fa(ShengMu.f, YunMu.e), fo(ShengMu.f, YunMu.o), fu(ShengMu.f, YunMu.u),
    fei(ShengMu.f, YunMu.ei), fou(ShengMu.f, YunMu.ou),
    fan(ShengMu.f, YunMu.an), fen(ShengMu.f, YunMu.en),
    fang(ShengMu.f, YunMu.ang), feng(ShengMu.f, YunMu.eng),
    da(ShengMu.d, YunMu.a), de(ShengMu.d, YunMu.e), di(ShengMu.d, YunMu.i), du(ShengMu.d, YunMu.u),
    dai(ShengMu.d, YunMu.ai), dei(ShengMu.d, YunMu.ei), dui(ShengMu.d, YunMu.ui), dao(ShengMu.d, YunMu.ao), dou(ShengMu.d, YunMu.ou), diu(ShengMu.d, YunMu.iu), die(ShengMu.d, YunMu.ie),
    dan(ShengMu.d, YunMu.an), den(ShengMu.d, YunMu.en), dun(ShengMu.d, YunMu.un),
    dang(ShengMu.d, YunMu.ang), deng(ShengMu.d, YunMu.eng), ding(ShengMu.d, YunMu.ing), dong(ShengMu.d, YunMu.ong),
    dia(ShengMu.d, YunMu.ia), dian(ShengMu.d, YunMu.ian), diao(ShengMu.d, YunMu.iao), duan(ShengMu.d, YunMu.uan), duo(ShengMu.d, YunMu.uo),
    ta(ShengMu.t, YunMu.a), te(ShengMu.t, YunMu.e), ti(ShengMu.t, YunMu.i), tu(ShengMu.t, YunMu.u),
    tai(ShengMu.t, YunMu.ai), tui(ShengMu.t, YunMu.ui), tao(ShengMu.t, YunMu.ao), tou(ShengMu.t, YunMu.ou), tie(ShengMu.t, YunMu.ie),
    tan(ShengMu.t, YunMu.an), tun(ShengMu.t, YunMu.un),
    tang(ShengMu.t, YunMu.ang), teng(ShengMu.t, YunMu.eng), ting(ShengMu.t, YunMu.ing), tong(ShengMu.t, YunMu.ong),
    tian(ShengMu.t, YunMu.ian), tiao(ShengMu.t, YunMu.iao), tuan(ShengMu.t, YunMu.uan), tuo(ShengMu.t, YunMu.uo),
    na(ShengMu.n, YunMu.a), ne(ShengMu.n, YunMu.e), ni(ShengMu.n, YunMu.i), nu(ShengMu.n, YunMu.u), nü(ShengMu.n, YunMu.ü),
    nai(ShengMu.n, YunMu.ai), nei(ShengMu.n, YunMu.ei), nao(ShengMu.n, YunMu.ao), nou(ShengMu.n, YunMu.ou), niu(ShengMu.n, YunMu.iu), nie(ShengMu.n, YunMu.ie), nüe(ShengMu.n, YunMu.üe),
    nan(ShengMu.n, YunMu.an), nen(ShengMu.n, YunMu.en), nin(ShengMu.n, YunMu._in),
    nang(ShengMu.n, YunMu.ang), neng(ShengMu.n, YunMu.eng), ning(ShengMu.n, YunMu.ing), nong(ShengMu.n, YunMu.ong),
    nian(ShengMu.n, YunMu.ian), niang(ShengMu.n, YunMu.iang), niao(ShengMu.n, YunMu.iao), nuan(ShengMu.n, YunMu.uan), nuo(ShengMu.n, YunMu.uo),
    la(ShengMu.l, YunMu.a), lo(ShengMu.l, YunMu.o), le(ShengMu.l, YunMu.e), li(ShengMu.l, YunMu.i), lu(ShengMu.l, YunMu.u), lü(ShengMu.l, YunMu.ü),
    lai(ShengMu.l, YunMu.ai), lei(ShengMu.l, YunMu.ei), lao(ShengMu.l, YunMu.ao), lou(ShengMu.l, YunMu.ou), liu(ShengMu.l, YunMu.iu), lie(ShengMu.l, YunMu.ie), lüe(ShengMu.l, YunMu.üe),
    lan(ShengMu.l, YunMu.an), lin(ShengMu.l, YunMu._in), lun(ShengMu.l, YunMu.un),
    lang(ShengMu.l, YunMu.ang), leng(ShengMu.l, YunMu.eng), ling(ShengMu.l, YunMu.ing), long(ShengMu.l, YunMu.ong),
    lia(ShengMu.l, YunMu.ia), lian(ShengMu.l, YunMu.ian), liang(ShengMu.l, YunMu.iang), liao(ShengMu.l, YunMu.iao), luan(ShengMu.l, YunMu.uan), luo(ShengMu.l, YunMu.uo),
    ga(ShengMu.g, YunMu.a), ge(ShengMu.g, YunMu.e), gu(ShengMu.g, YunMu.u),
    gai(ShengMu.g, YunMu.ai), gei(ShengMu.g, YunMu.ei), gui(ShengMu.g, YunMu.ui), gao(ShengMu.g, YunMu.ao), gou(ShengMu.g, YunMu.ou),
    gan(ShengMu.g, YunMu.an), gen(ShengMu.g, YunMu.en), gun(ShengMu.g, YunMu.un),
    gang(ShengMu.g, YunMu.ang), geng(ShengMu.g, YunMu.eng), gong(ShengMu.g, YunMu.ong),
    gua(ShengMu.g, YunMu.ua), guai(ShengMu.g, YunMu.uai), guan(ShengMu.g, YunMu.uan), guang(ShengMu.g, YunMu.uang), guo(ShengMu.g, YunMu.uo),
    ka(ShengMu.k, YunMu.a), ke(ShengMu.k, YunMu.e), ku(ShengMu.k, YunMu.u),
    kai(ShengMu.k, YunMu.ai), kei(ShengMu.k, YunMu.ei), kui(ShengMu.k, YunMu.ui), kao(ShengMu.k, YunMu.ao), kou(ShengMu.k, YunMu.ou),
    kan(ShengMu.k, YunMu.an), ken(ShengMu.k, YunMu.en), kun(ShengMu.k, YunMu.un),
    kang(ShengMu.k, YunMu.ang), keng(ShengMu.k, YunMu.eng), kong(ShengMu.k, YunMu.ong),
    kua(ShengMu.k, YunMu.ua), kuai(ShengMu.k, YunMu.uai), kuan(ShengMu.k, YunMu.uan), kuang(ShengMu.k, YunMu.uang), kuo(ShengMu.k, YunMu.uo),
    ha(ShengMu.h, YunMu.a), he(ShengMu.h, YunMu.e), hu(ShengMu.h, YunMu.u),
    hai(ShengMu.h, YunMu.ai), hei(ShengMu.h, YunMu.ei), hui(ShengMu.h, YunMu.ui), hao(ShengMu.h, YunMu.ao), hou(ShengMu.h, YunMu.ou),
    han(ShengMu.h, YunMu.an), hen(ShengMu.h, YunMu.en), hun(ShengMu.h, YunMu.un),
    hang(ShengMu.h, YunMu.ang), heng(ShengMu.h, YunMu.eng), hong(ShengMu.h, YunMu.ong),
    hua(ShengMu.h, YunMu.ua), huai(ShengMu.h, YunMu.uai), huan(ShengMu.h, YunMu.uan), huang(ShengMu.h, YunMu.uang), huo(ShengMu.h, YunMu.uo),
    ji(ShengMu.j, YunMu.i), ju(ShengMu.j, YunMu.ü),
    jiu(ShengMu.j, YunMu.iu), jie(ShengMu.j, YunMu.ie), jue(ShengMu.j, YunMu.üe),
    jin(ShengMu.j, YunMu._in), jun(ShengMu.j, YunMu.ün),
    jing(ShengMu.j, YunMu.ing),
    jia(ShengMu.j, YunMu.ia), jian(ShengMu.j, YunMu.ian), jiang(ShengMu.j, YunMu.iang), jiao(ShengMu.j, YunMu.iao), jiong(ShengMu.j, YunMu.iong), juan(ShengMu.j, YunMu.üan),
    qi(ShengMu.q, YunMu.i), qu(ShengMu.q, YunMu.ü),
    qiu(ShengMu.q, YunMu.iu), qie(ShengMu.q, YunMu.ie), que(ShengMu.q, YunMu.üe),
    qin(ShengMu.q, YunMu._in), qun(ShengMu.q, YunMu.ün),
    qing(ShengMu.q, YunMu.ing),
    qia(ShengMu.q, YunMu.ia), qian(ShengMu.q, YunMu.ian), qiang(ShengMu.q, YunMu.iang), qiao(ShengMu.q, YunMu.iao), qiong(ShengMu.q, YunMu.iong), quan(ShengMu.q, YunMu.üan),
    xi(ShengMu.x, YunMu.i), xu(ShengMu.x, YunMu.ü),
    xiu(ShengMu.x, YunMu.iu), xie(ShengMu.x, YunMu.ie), xue(ShengMu.x, YunMu.üe),
    xin(ShengMu.x, YunMu._in), xun(ShengMu.x, YunMu.ün),
    xing(ShengMu.x, YunMu.ing),
    xia(ShengMu.x, YunMu.ia), xian(ShengMu.x, YunMu.ian), xiang(ShengMu.x, YunMu.iang), xiao(ShengMu.x, YunMu.iao), xiong(ShengMu.x, YunMu.iong), xuan(ShengMu.x, YunMu.üan),
    zha(ShengMu.zh, YunMu.a), zhe(ShengMu.zh, YunMu.e), zhi(ShengMu.zh, YunMu.i), zhu(ShengMu.zh, YunMu.u),
    zhai(ShengMu.zh, YunMu.ai), zhei(ShengMu.zh, YunMu.ei), zhui(ShengMu.zh, YunMu.ui), zhao(ShengMu.zh, YunMu.ao), zhou(ShengMu.zh, YunMu.ou),
    zhan(ShengMu.zh, YunMu.an), zhen(ShengMu.zh, YunMu.en), zhun(ShengMu.zh, YunMu.un),
    zhang(ShengMu.zh, YunMu.ang), zheng(ShengMu.zh, YunMu.eng), zhong(ShengMu.zh, YunMu.ong),
    zhua(ShengMu.zh, YunMu.ua), zhuai(ShengMu.zh, YunMu.uai), zhuan(ShengMu.zh, YunMu.uan), zhuang(ShengMu.zh, YunMu.uang), zhuo(ShengMu.zh, YunMu.uo),
    cha(ShengMu.ch, YunMu.a), che(ShengMu.ch, YunMu.e), chi(ShengMu.ch, YunMu.i), chu(ShengMu.ch, YunMu.u),
    chai(ShengMu.ch, YunMu.ai), chui(ShengMu.ch, YunMu.ui), chao(ShengMu.ch, YunMu.ao), chou(ShengMu.ch, YunMu.ou),
    chan(ShengMu.ch, YunMu.an), chen(ShengMu.ch, YunMu.en), chun(ShengMu.ch, YunMu.un),
    chang(ShengMu.ch, YunMu.ang), cheng(ShengMu.ch, YunMu.eng), chong(ShengMu.ch, YunMu.ong),
    chua(ShengMu.ch, YunMu.ua), chuai(ShengMu.ch, YunMu.uai), chuan(ShengMu.ch, YunMu.uan), chuang(ShengMu.ch, YunMu.uang), chuo(ShengMu.ch, YunMu.uo),
    sha(ShengMu.sh, YunMu.a), she(ShengMu.sh, YunMu.e), shi(ShengMu.sh, YunMu.i), shu(ShengMu.sh, YunMu.u),
    shai(ShengMu.sh, YunMu.ai), shei(ShengMu.sh, YunMu.ei), shui(ShengMu.ch, YunMu.ui), shao(ShengMu.sh, YunMu.ao), shou(ShengMu.sh, YunMu.ou),
    shan(ShengMu.sh, YunMu.an), shen(ShengMu.sh, YunMu.en), shun(ShengMu.sh, YunMu.un),
    shang(ShengMu.sh, YunMu.ang), sheng(ShengMu.sh, YunMu.eng),
    shua(ShengMu.sh, YunMu.ua), shuai(ShengMu.sh, YunMu.uai), shuan(ShengMu.sh, YunMu.uan), shuang(ShengMu.sh, YunMu.uang), shuo(ShengMu.sh, YunMu.uo),
    re(ShengMu.r, YunMu.e), ri(ShengMu.r, YunMu.i), ru(ShengMu.r, YunMu.u),
    rui(ShengMu.r, YunMu.ui), rao(ShengMu.r, YunMu.ao), rou(ShengMu.r, YunMu.ou),
    ran(ShengMu.r, YunMu.an), ren(ShengMu.r, YunMu.en), run(ShengMu.r, YunMu.un),
    rang(ShengMu.r, YunMu.ang), reng(ShengMu.r, YunMu.eng), rong(ShengMu.r, YunMu.ong),
    rua(ShengMu.r, YunMu.ua), ruan(ShengMu.r, YunMu.uan), ruo(ShengMu.r, YunMu.uo),
    za(ShengMu.z, YunMu.a), ze(ShengMu.z, YunMu.e), zi(ShengMu.z, YunMu.i), zu(ShengMu.z, YunMu.u),
    zai(ShengMu.z, YunMu.ai), zei(ShengMu.z, YunMu.ei), zui(ShengMu.z, YunMu.ui), zao(ShengMu.z, YunMu.ao), zou(ShengMu.z, YunMu.ou),
    zan(ShengMu.z, YunMu.an), zen(ShengMu.z, YunMu.en), zun(ShengMu.z, YunMu.un),
    zang(ShengMu.z, YunMu.ang), zeng(ShengMu.z, YunMu.eng), zong(ShengMu.z, YunMu.ong),
    zuan(ShengMu.z, YunMu.uan), zuo(ShengMu.z, YunMu.uo),
    ca(ShengMu.c, YunMu.a), ce(ShengMu.c, YunMu.e), ci(ShengMu.c, YunMu.i), cu(ShengMu.c, YunMu.u),
    cai(ShengMu.c, YunMu.ai), cui(ShengMu.c, YunMu.ui), cao(ShengMu.c, YunMu.ao), cou(ShengMu.c, YunMu.ou),
    can(ShengMu.c, YunMu.an), cen(ShengMu.c, YunMu.en), cun(ShengMu.c, YunMu.un),
    cang(ShengMu.c, YunMu.ang), ceng(ShengMu.c, YunMu.eng), cong(ShengMu.c, YunMu.ong),
    cuan(ShengMu.c, YunMu.uan), cuo(ShengMu.c, YunMu.uo),
    sa(ShengMu.s, YunMu.a), se(ShengMu.s, YunMu.e), si(ShengMu.s, YunMu.i), su(ShengMu.s, YunMu.u),
    sai(ShengMu.s, YunMu.ai), sui(ShengMu.s, YunMu.ui), sao(ShengMu.s, YunMu.ao), sou(ShengMu.s, YunMu.ou),
    san(ShengMu.s, YunMu.an), sen(ShengMu.s, YunMu.en), sun(ShengMu.s, YunMu.un),
    sang(ShengMu.s, YunMu.ang), seng(ShengMu.s, YunMu.eng), song(ShengMu.s, YunMu.ong),
    suan(ShengMu.s, YunMu.uan), suo(ShengMu.s, YunMu.uo),
    ya(ShengMu.y, YunMu.a), yo(ShengMu.y, YunMu.o), ye(ShengMu.y, YunMu.e), yi(ShengMu.y, YunMu.i), yu(ShengMu.y, YunMu.ü),
    yao(ShengMu.y, YunMu.ao), you(ShengMu.y, YunMu.ou), yue(ShengMu.y, YunMu.üe),
    yan(ShengMu.y, YunMu.an), yin(ShengMu.y, YunMu._in), yun(ShengMu.y, YunMu.ün),
    yang(ShengMu.y, YunMu.ang), ying(ShengMu.y, YunMu.ing), yong(ShengMu.y, YunMu.ong),
    yuan(ShengMu.y, YunMu.üan),
    wa(ShengMu.w, YunMu.a), wo(ShengMu.w, YunMu.o), wu(ShengMu.w, YunMu.u),
    wai(ShengMu.w, YunMu.ai), wei(ShengMu.w, YunMu.ei),
    wan(ShengMu.w, YunMu.an), wen(ShengMu.w, YunMu.en),
    wang(ShengMu.w, YunMu.ang), weng(ShengMu.w, YunMu.eng),
}