package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;
import java.io.File;
import java.net.URLEncoder;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f15943a = "h";
    private final Context b;

    public h(Context context, int i9) {
        this.b = context;
    }

    public final void a(com.mbridge.msdk.foundation.entity.l lVar) {
    }

    public final void b(String str, String str2, String str3, String str4, String str5, boolean z8) {
        try {
            if (!TextUtils.isEmpty(str5)) {
                StringBuilder sb = new StringBuilder();
                if (z8) {
                    sb.append("hb=1&");
                }
                sb.append("key=");
                sb.append(URLEncoder.encode("2000066", "utf-8"));
                sb.append("&rid=");
                sb.append(URLEncoder.encode(str, "utf-8"));
                sb.append("&rid_n=");
                sb.append(URLEncoder.encode(str2, "utf-8"));
                sb.append("&cid=");
                sb.append(URLEncoder.encode(str3, "utf-8"));
                sb.append("&unit_id=");
                sb.append(URLEncoder.encode(str4, "utf-8"));
                sb.append("&err_method=");
                sb.append(str5);
                com.mbridge.msdk.foundation.same.report.d.c.a().d(sb.toString());
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }

    public h(Context context) {
        this.b = context.getApplicationContext();
    }

    public final void a(int i9, int i10, String str, String str2, String str3) {
        Context context = this.b;
        try {
            StringBuilder sb = new StringBuilder("key=");
            sb.append(URLEncoder.encode("2000058", "utf-8"));
            sb.append("&appid=");
            sb.append(URLEncoder.encode(com.mbridge.msdk.foundation.controller.c.m().k(), "utf-8"));
            sb.append("&dl_type=");
            sb.append(URLEncoder.encode(i9 + "", "utf-8"));
            sb.append("&dl_link_type=");
            sb.append(URLEncoder.encode(i10 + "", "utf-8"));
            sb.append("&rid=");
            sb.append(URLEncoder.encode(str, "utf-8"));
            sb.append("&rid_n=");
            sb.append(URLEncoder.encode(str2, "utf-8"));
            sb.append("&cid=");
            sb.append(URLEncoder.encode(str3, "utf-8"));
            sb.append("&tgt_v=");
            sb.append(URLEncoder.encode(z.t(context) + "", "utf-8"));
            sb.append("&app_v_n=");
            sb.append(URLEncoder.encode(z.p(context) + "", "utf-8"));
            sb.append("&app_v_c=");
            sb.append(URLEncoder.encode(z.q(context) + "", "utf-8"));
            com.mbridge.msdk.foundation.same.report.d.c.a().d(sb.toString());
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("ReportControllerDiff", e4.getMessage());
            }
        }
    }

    public final void a(String str, File file) {
        com.mbridge.msdk.foundation.same.report.d.c.a().d(str);
        if (file != null) {
            try {
                file.delete();
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b(f15943a, "reportException", e4);
                }
            }
        }
    }

    public final void a(String str, String str2, String str3, String str4, String str5, boolean z8) {
        try {
            StringBuilder sb = new StringBuilder();
            if (z8) {
                sb.append("hb=1&");
            }
            sb.append("key=");
            sb.append(URLEncoder.encode("2000065", "utf-8"));
            sb.append("&rid=");
            sb.append(URLEncoder.encode(str, "utf-8"));
            sb.append("&rid_n=");
            sb.append(URLEncoder.encode(str2, "utf-8"));
            sb.append("&cid=");
            sb.append(URLEncoder.encode(str3, "utf-8"));
            sb.append("&unit_id=");
            sb.append(URLEncoder.encode(str4, "utf-8"));
            sb.append("&click_url=");
            sb.append(URLEncoder.encode(str5, "utf-8"));
            com.mbridge.msdk.foundation.same.report.d.c.a().d(sb.toString());
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
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
                            if (h.this.b != null && lVar != null) {
                                com.mbridge.msdk.foundation.db.l.a(com.mbridge.msdk.foundation.db.g.a(h.this.b)).a(lVar.d());
                                if (bool.booleanValue() && com.mbridge.msdk.foundation.db.l.a(com.mbridge.msdk.foundation.db.g.a(h.this.b)).b() > 20) {
                                    com.mbridge.msdk.foundation.controller.d.a().b();
                                }
                            }
                        } catch (Exception e4) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b(h.f15943a, "reportNetError", e4);
                            }
                        }
                    }
                });
            } else if (lVar.b().equals("POST")) {
                com.mbridge.msdk.foundation.same.report.d.c.a().d(lVar.a());
                com.mbridge.msdk.foundation.same.f.b.e().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.report.h.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (h.this.b != null && lVar != null) {
                            try {
                                com.mbridge.msdk.foundation.db.l.a(com.mbridge.msdk.foundation.db.g.a(h.this.b)).a(lVar.a(), lVar.d(), lVar.c());
                                if (bool.booleanValue() && com.mbridge.msdk.foundation.db.l.a(com.mbridge.msdk.foundation.db.g.a(h.this.b)).a() > 0) {
                                    com.mbridge.msdk.foundation.controller.d.a().b();
                                }
                            } catch (Exception e4) {
                                if (MBridgeConstans.DEBUG) {
                                    ad.b(h.f15943a, "reportNetError", e4);
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
            StringBuilder sb = new StringBuilder("key=");
            try {
                int l = z.l(this.b);
                sb.append(URLEncoder.encode("2000071", "utf-8"));
                sb.append("&rid=");
                sb.append(URLEncoder.encode(str, "utf-8"));
                sb.append("&rid_n=");
                sb.append(URLEncoder.encode(str2, "utf-8"));
                sb.append("&cid=");
                sb.append(URLEncoder.encode(str3, "utf-8"));
                sb.append("&unit_id=");
                sb.append(URLEncoder.encode(str4, "utf-8"));
                sb.append("&reason=");
                sb.append(URLEncoder.encode(str5, "utf-8"));
                sb.append("&network_type=");
                sb.append(URLEncoder.encode(l + "", "utf-8"));
                sb.append("&result=");
                sb.append(URLEncoder.encode("0", "utf-8"));
                com.mbridge.msdk.foundation.same.report.d.c.a().d(sb.toString());
            } catch (Exception e4) {
                e = e4;
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    public final void a() {
        try {
            if (i.a()) {
                String k6 = com.mbridge.msdk.foundation.controller.c.m().k();
                com.mbridge.msdk.c.g b = com.mbridge.msdk.c.h.a().b(k6);
                if (b == null) {
                    com.mbridge.msdk.c.h.a();
                    b = com.mbridge.msdk.c.i.a();
                }
                int J8 = b.J();
                String str = "key=2000053&Appid=" + k6 + "&uptips2=" + b.ar() + "&info_status=" + com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().h() + "&iseu=" + J8;
                String c9 = com.mbridge.msdk.foundation.tools.e.c();
                if (!TextUtils.isEmpty(c9)) {
                    str = str + "&gaid=" + c9;
                }
                com.mbridge.msdk.foundation.same.report.d.c.a().d(str + "&GDPR_area=" + b.aE() + "&GDPR_consent=" + com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().g());
                i.b();
            }
        } catch (Throwable th) {
            ad.b(f15943a, th.getMessage());
        }
    }
}
