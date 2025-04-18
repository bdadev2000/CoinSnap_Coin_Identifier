package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;
import java.io.File;
import java.net.URLEncoder;

/* loaded from: classes4.dex */
public class h {
    public static final String a = "h";

    /* renamed from: b, reason: collision with root package name */
    private final Context f13505b;

    public h(Context context, int i10) {
        this.f13505b = context;
    }

    public final void a(com.mbridge.msdk.foundation.entity.l lVar) {
    }

    public final void b(String str, String str2, String str3, String str4, String str5, boolean z10) {
        try {
            if (!TextUtils.isEmpty(str5)) {
                StringBuilder sb2 = new StringBuilder();
                if (z10) {
                    sb2.append("hb=1&");
                }
                sb2.append("key=");
                sb2.append(URLEncoder.encode("2000066", "utf-8"));
                sb2.append("&rid=");
                sb2.append(URLEncoder.encode(str, "utf-8"));
                sb2.append("&rid_n=");
                sb2.append(URLEncoder.encode(str2, "utf-8"));
                sb2.append("&cid=");
                sb2.append(URLEncoder.encode(str3, "utf-8"));
                sb2.append("&unit_id=");
                sb2.append(URLEncoder.encode(str4, "utf-8"));
                sb2.append("&err_method=");
                sb2.append(str5);
                com.mbridge.msdk.foundation.same.report.d.c.a().d(sb2.toString());
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public h(Context context) {
        this.f13505b = context.getApplicationContext();
    }

    public final void a(int i10, int i11, String str, String str2, String str3) {
        Context context = this.f13505b;
        try {
            StringBuilder sb2 = new StringBuilder("key=");
            sb2.append(URLEncoder.encode("2000058", "utf-8"));
            sb2.append("&appid=");
            sb2.append(URLEncoder.encode(com.mbridge.msdk.foundation.controller.c.m().k(), "utf-8"));
            sb2.append("&dl_type=");
            sb2.append(URLEncoder.encode(i10 + "", "utf-8"));
            sb2.append("&dl_link_type=");
            sb2.append(URLEncoder.encode(i11 + "", "utf-8"));
            sb2.append("&rid=");
            sb2.append(URLEncoder.encode(str, "utf-8"));
            sb2.append("&rid_n=");
            sb2.append(URLEncoder.encode(str2, "utf-8"));
            sb2.append("&cid=");
            sb2.append(URLEncoder.encode(str3, "utf-8"));
            sb2.append("&tgt_v=");
            sb2.append(URLEncoder.encode(z.t(context) + "", "utf-8"));
            sb2.append("&app_v_n=");
            sb2.append(URLEncoder.encode(z.p(context) + "", "utf-8"));
            sb2.append("&app_v_c=");
            sb2.append(URLEncoder.encode(z.q(context) + "", "utf-8"));
            com.mbridge.msdk.foundation.same.report.d.c.a().d(sb2.toString());
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("ReportControllerDiff", e2.getMessage());
            }
        }
    }

    public final void a(String str, File file) {
        com.mbridge.msdk.foundation.same.report.d.c.a().d(str);
        if (file != null) {
            try {
                file.delete();
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b(a, "reportException", e2);
                }
            }
        }
    }

    public final void a(String str, String str2, String str3, String str4, String str5, boolean z10) {
        try {
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                sb2.append("hb=1&");
            }
            sb2.append("key=");
            sb2.append(URLEncoder.encode("2000065", "utf-8"));
            sb2.append("&rid=");
            sb2.append(URLEncoder.encode(str, "utf-8"));
            sb2.append("&rid_n=");
            sb2.append(URLEncoder.encode(str2, "utf-8"));
            sb2.append("&cid=");
            sb2.append(URLEncoder.encode(str3, "utf-8"));
            sb2.append("&unit_id=");
            sb2.append(URLEncoder.encode(str4, "utf-8"));
            sb2.append("&click_url=");
            sb2.append(URLEncoder.encode(str5, "utf-8"));
            com.mbridge.msdk.foundation.same.report.d.c.a().d(sb2.toString());
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public final void a(final com.mbridge.msdk.foundation.entity.l lVar, final Boolean bool) {
        if (lVar != null) {
            if (lVar.b().equals("GET")) {
                com.mbridge.msdk.foundation.same.report.d.c.a().d(lVar.a());
                com.mbridge.msdk.foundation.same.f.b.e().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.report.h.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (h.this.f13505b != null && lVar != null) {
                                com.mbridge.msdk.foundation.db.l.a(com.mbridge.msdk.foundation.db.g.a(h.this.f13505b)).a(lVar.d());
                                if (bool.booleanValue() && com.mbridge.msdk.foundation.db.l.a(com.mbridge.msdk.foundation.db.g.a(h.this.f13505b)).b() > 20) {
                                    com.mbridge.msdk.foundation.controller.d.a().b();
                                }
                            }
                        } catch (Exception e2) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b(h.a, "reportNetError", e2);
                            }
                        }
                    }
                });
            } else if (lVar.b().equals("POST")) {
                com.mbridge.msdk.foundation.same.report.d.c.a().d(lVar.a());
                com.mbridge.msdk.foundation.same.f.b.e().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.report.h.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (h.this.f13505b != null && lVar != null) {
                            try {
                                com.mbridge.msdk.foundation.db.l.a(com.mbridge.msdk.foundation.db.g.a(h.this.f13505b)).a(lVar.a(), lVar.d(), lVar.c());
                                if (bool.booleanValue() && com.mbridge.msdk.foundation.db.l.a(com.mbridge.msdk.foundation.db.g.a(h.this.f13505b)).a() > 0) {
                                    com.mbridge.msdk.foundation.controller.d.a().b();
                                }
                            } catch (Exception e2) {
                                if (MBridgeConstans.DEBUG) {
                                    ad.b(h.a, "reportNetError", e2);
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    public final void a(String str, String str2, String str3, String str4, String str5) {
        try {
            StringBuilder sb2 = new StringBuilder("key=");
            try {
                int l10 = z.l(this.f13505b);
                sb2.append(URLEncoder.encode("2000071", "utf-8"));
                sb2.append("&rid=");
                sb2.append(URLEncoder.encode(str, "utf-8"));
                sb2.append("&rid_n=");
                sb2.append(URLEncoder.encode(str2, "utf-8"));
                sb2.append("&cid=");
                sb2.append(URLEncoder.encode(str3, "utf-8"));
                sb2.append("&unit_id=");
                sb2.append(URLEncoder.encode(str4, "utf-8"));
                sb2.append("&reason=");
                sb2.append(URLEncoder.encode(str5, "utf-8"));
                sb2.append("&network_type=");
                sb2.append(URLEncoder.encode(l10 + "", "utf-8"));
                sb2.append("&result=");
                sb2.append(URLEncoder.encode("0", "utf-8"));
                com.mbridge.msdk.foundation.same.report.d.c.a().d(sb2.toString());
            } catch (Exception e2) {
                e = e2;
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    public final void a() {
        try {
            if (i.a()) {
                String k10 = com.mbridge.msdk.foundation.controller.c.m().k();
                com.mbridge.msdk.c.g b3 = com.mbridge.msdk.c.h.a().b(k10);
                if (b3 == null) {
                    com.mbridge.msdk.c.h.a();
                    b3 = com.mbridge.msdk.c.i.a();
                }
                int J = b3.J();
                String str = "key=2000053&Appid=" + k10 + "&uptips2=" + b3.ar() + "&info_status=" + com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().h() + "&iseu=" + J;
                String c10 = com.mbridge.msdk.foundation.tools.e.c();
                if (!TextUtils.isEmpty(c10)) {
                    str = str + "&gaid=" + c10;
                }
                com.mbridge.msdk.foundation.same.report.d.c.a().d(str + "&GDPR_area=" + b3.aE() + "&GDPR_consent=" + com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().g());
                i.b();
            }
        } catch (Throwable th2) {
            ad.b(a, th2.getMessage());
        }
    }
}
