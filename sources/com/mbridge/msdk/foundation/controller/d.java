package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.j;
import com.mbridge.msdk.foundation.controller.a;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.l;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.ag;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.interstitialvideo.out.MBInterstitialVideoHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    private static volatile d f13050c;

    /* renamed from: d, reason: collision with root package name */
    private int f13052d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, Object> f13053e;

    /* renamed from: f, reason: collision with root package name */
    private FastKV f13054f;

    /* renamed from: h, reason: collision with root package name */
    private String f13056h;

    /* renamed from: i, reason: collision with root package name */
    private String f13057i;

    /* renamed from: j, reason: collision with root package name */
    private String f13058j;

    /* renamed from: k, reason: collision with root package name */
    private Context f13059k;

    /* renamed from: l, reason: collision with root package name */
    private String f13060l;

    /* renamed from: m, reason: collision with root package name */
    private com.mbridge.msdk.b.a f13061m;

    /* renamed from: n, reason: collision with root package name */
    private String f13062n;
    public final int a = 2;

    /* renamed from: g, reason: collision with root package name */
    private boolean f13055g = false;

    /* renamed from: b, reason: collision with root package name */
    Handler f13051b = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.foundation.controller.d.6
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            List list;
            List list2;
            try {
                int i10 = message.what;
                if (i10 != 2) {
                    if (i10 != 7) {
                        if (i10 == 9) {
                            g gVar = (g) message.obj;
                            com.mbridge.msdk.foundation.tools.g d10 = c.m().d();
                            if (d10 != null && d10.b() && gVar != null && gVar.I() == 1) {
                                com.mbridge.msdk.foundation.same.report.b.d.a(d.this.f13059k).b();
                            }
                            if (d10 != null && d10.a()) {
                                com.mbridge.msdk.foundation.same.report.b.c.a();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    Object obj = message.obj;
                    if (obj != null && (obj instanceof List) && (list2 = (List) obj) != null) {
                        list2.size();
                        return;
                    }
                    return;
                }
                Object obj2 = message.obj;
                if ((obj2 instanceof List) && (list = (List) obj2) != null && list.size() > 0) {
                    h hVar = new h(d.this.f13059k, 0);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        l lVar = (l) list.get(i11);
                        Boolean bool = Boolean.FALSE;
                        if (i11 == list.size() - 1) {
                            bool = Boolean.TRUE;
                        }
                        hVar.a(lVar, bool);
                    }
                }
            } catch (Exception unused) {
                ad.b("SDKController", "REPORT HANDLE ERROR!");
            }
        }
    };

    private d() {
    }

    public static d a() {
        if (f13050c == null) {
            synchronized (d.class) {
                if (f13050c == null) {
                    f13050c = new d();
                }
            }
        }
        return f13050c;
    }

    public final void b() {
        List<l> a;
        if (this.f13059k == null || this.f13051b == null) {
            return;
        }
        try {
            int i10 = af.a().a("e_r_r_c_t_r_l", false) ? 5 : 1;
            com.mbridge.msdk.foundation.same.report.c.a.a();
            Context context = this.f13059k;
            if (context != null && com.mbridge.msdk.foundation.db.l.a(com.mbridge.msdk.foundation.db.g.a(context)).a() > 0) {
                a = com.mbridge.msdk.foundation.db.l.a(com.mbridge.msdk.foundation.db.g.a(context)).a(i10);
                if (a != null || a.size() <= 0) {
                }
                Message obtainMessage = this.f13051b.obtainMessage();
                obtainMessage.what = 2;
                obtainMessage.obj = a;
                this.f13051b.sendMessage(obtainMessage);
                return;
            }
            a = null;
            if (a != null) {
            }
        } catch (Exception unused) {
            if (MBridgeConstans.DEBUG) {
                ad.b("SDKController", "report netstate error !");
            }
        }
    }

    public final void c() {
        Handler handler = this.f13051b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void a(Map map, final Context context) {
        Object obj;
        String str;
        if (context != null) {
            if (!TextUtils.isEmpty(MBridgeConstans.DEVELOPER_CUSTOM_PACKAGE)) {
                c.m().f(MBridgeConstans.DEVELOPER_CUSTOM_PACKAGE);
            } else if (map.containsKey(MBridgeConstans.KEY_MBRIDGE_CUSTOM_PACKAGE_NAME) && (obj = map.get(MBridgeConstans.KEY_MBRIDGE_CUSTOM_PACKAGE_NAME)) != null) {
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2)) {
                    c.m().f(str2);
                }
            }
            if (map != null) {
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_APPID)) {
                    this.f13056h = (String) map.get(MBridgeConstans.ID_MBRIDGE_APPID);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_APPKEY)) {
                    this.f13057i = (String) map.get(MBridgeConstans.ID_MBRIDGE_APPKEY);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_WX_APPID)) {
                    this.f13062n = (String) map.get(MBridgeConstans.ID_MBRIDGE_WX_APPID);
                }
                if (map.containsKey(MBridgeConstans.PACKAGE_NAME_MANIFEST)) {
                    this.f13058j = (String) map.get(MBridgeConstans.PACKAGE_NAME_MANIFEST);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH)) {
                    this.f13060l = (String) map.get(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH);
                }
            }
            this.f13059k = context.getApplicationContext();
            c.m().b(this.f13059k);
            c.m().d(this.f13056h);
            c.m().e(this.f13057i);
            c.m().a(this.f13062n);
            c.m().c(this.f13058j);
            c.m().a(new a.InterfaceC0168a() { // from class: com.mbridge.msdk.foundation.controller.d.4
            }, this.f13051b);
            try {
                com.mbridge.msdk.foundation.same.net.e.d.f().e();
            } catch (Throwable th2) {
                ad.b("SDKController", th2.getMessage());
            }
            if (this.f13055g) {
                return;
            }
            ag.a(this.f13059k);
            Context applicationContext = this.f13059k.getApplicationContext();
            try {
                if (this.f13054f == null) {
                    try {
                        this.f13054f = new FastKV.Builder(com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), x.a("H+tU+FeXHM==")).build();
                    } catch (Exception unused) {
                        this.f13054f = null;
                    }
                }
                FastKV fastKV = this.f13054f;
                String str3 = "";
                if (fastKV != null) {
                    String string = fastKV.getString(x.a("H+tU+bfPhM=="), "");
                    String string2 = this.f13054f.getString(x.a("H+tU+Fz8"), "");
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.U) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f13276g)) {
                        com.mbridge.msdk.foundation.same.a.U = com.mbridge.msdk.foundation.a.a.a.a().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                        com.mbridge.msdk.foundation.same.a.f13276g = com.mbridge.msdk.foundation.a.a.a.a().a(a.a);
                    }
                    if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2)) {
                        if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.U) || !TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f13276g)) {
                            this.f13054f.putString(x.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.U);
                            this.f13054f.putString(x.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f13276g);
                        }
                    } else {
                        com.mbridge.msdk.foundation.same.a.U = string;
                        com.mbridge.msdk.foundation.same.a.f13276g = string2;
                        com.mbridge.msdk.foundation.a.a.a.a().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.U);
                        com.mbridge.msdk.foundation.a.a.a.a().a(a.a, com.mbridge.msdk.foundation.same.a.f13276g);
                    }
                } else {
                    SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(x.a("H+tU+FeXHM=="), 0);
                    if (sharedPreferences != null) {
                        str3 = sharedPreferences.getString(x.a("H+tU+bfPhM=="), "");
                        str = sharedPreferences.getString(x.a("H+tU+Fz8"), "");
                    } else {
                        str = "";
                    }
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.U) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f13276g)) {
                        com.mbridge.msdk.foundation.same.a.U = com.mbridge.msdk.foundation.a.a.a.a().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                        com.mbridge.msdk.foundation.same.a.f13276g = com.mbridge.msdk.foundation.a.a.a.a().a(a.a);
                    }
                    if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str)) {
                        if ((!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.U) || !TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f13276g)) && sharedPreferences != null) {
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putString(x.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.U);
                            edit.putString(x.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f13276g);
                            edit.apply();
                        }
                    } else {
                        com.mbridge.msdk.foundation.same.a.U = str3;
                        com.mbridge.msdk.foundation.same.a.f13276g = str;
                        com.mbridge.msdk.foundation.a.a.a.a().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.U);
                        com.mbridge.msdk.foundation.a.a.a.a().a(a.a, com.mbridge.msdk.foundation.same.a.f13276g);
                    }
                }
            } catch (Throwable th3) {
                ad.b("SDKController", th3.getMessage(), th3);
            }
            try {
                com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.controller.d.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        Looper.prepare();
                        d.a(d.this);
                        d.b(d.this);
                        Looper.loop();
                    }
                });
                com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.controller.d.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        d dVar = d.this;
                        d.a(dVar, dVar.f13056h);
                        if (!TextUtils.isEmpty(d.this.f13056h)) {
                            com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.SDK_APP_ID, d.this.f13056h);
                        }
                        new h(d.this.f13059k).a();
                        d.this.b();
                    }
                });
                i.c();
            } catch (Exception unused2) {
                ad.b("SDKController", "get app setting failed");
            }
            this.f13055g = true;
            z.f(context);
            long ax = com.mbridge.msdk.c.h.a().a(this.f13056h).ax();
            if (ax != 1300) {
                this.f13051b.postDelayed(new Runnable() { // from class: com.mbridge.msdk.foundation.controller.d.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        z.d(context);
                    }
                }, ax);
            }
        }
    }

    public static /* synthetic */ void b(d dVar) {
        List<com.mbridge.msdk.foundation.entity.a> k10;
        Object newInstance;
        Object newInstance2;
        try {
            g b3 = com.mbridge.msdk.c.h.a().b(c.m().k());
            if (b3 == null || (k10 = b3.k()) == null || k10.size() <= 0) {
                return;
            }
            for (com.mbridge.msdk.foundation.entity.a aVar : k10) {
                if (aVar.a() == 287) {
                    if (dVar.f13059k != null && (newInstance = MBInterstitialVideoHandler.class.getConstructor(String.class, String.class).newInstance("", aVar.b())) != null) {
                        MBInterstitialVideoHandler.class.getMethod("loadFormSelfFilling", new Class[0]).invoke(newInstance, new Object[0]);
                    }
                } else if (aVar.a() == 94 && (newInstance2 = MBRewardVideoHandler.class.getConstructor(String.class, String.class).newInstance("", aVar.b())) != null) {
                    MBRewardVideoHandler.class.getMethod("loadFormSelfFilling", new Class[0]).invoke(newInstance2, new Object[0]);
                }
            }
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0086 -> B:28:0x0089). Please report as a decompilation issue!!! */
    public final void a(Map<String, Object> map, int i10) {
        if (MBridgeSDKFactory.getMBridgeSDK().getStatus() != MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            ad.b("SDKController", "preloaad failed,sdk do not inited");
            return;
        }
        this.f13053e = map;
        this.f13052d = i10;
        c.m().k();
        if (map != null) {
            if (this.f13061m == null) {
                this.f13061m = new com.mbridge.msdk.b.a();
            }
            try {
                Map<String, Object> map2 = this.f13053e;
                if (map2 != null && map2.size() > 0 && this.f13053e.containsKey(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)) {
                    int intValue = ((Integer) this.f13053e.get(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)).intValue();
                    if (intValue == 0) {
                        Map<String, Object> map3 = this.f13053e;
                        int i11 = this.f13052d;
                        try {
                            com.mbridge.msdk.mbnative.f.a.class.getMethod("preload", Map.class, Integer.TYPE).invoke(com.mbridge.msdk.mbnative.f.a.class.newInstance(), map3, Integer.valueOf(i11));
                        } catch (Exception unused) {
                        }
                    } else if (1 != intValue && 2 != intValue) {
                        ad.b("SDKController", "unknow layout type in preload");
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static /* synthetic */ void a(d dVar) {
        try {
            com.mbridge.msdk.d.b.class.getDeclaredMethod("start", new Class[0]).invoke(com.mbridge.msdk.d.b.class.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), new Object[0]);
        } catch (Throwable th2) {
            ad.b("SDKController", th2.getMessage(), th2);
        }
    }

    public static /* synthetic */ void a(d dVar, final String str) {
        if (com.mbridge.msdk.c.h.a() == null) {
            return;
        }
        com.mbridge.msdk.c.h a = com.mbridge.msdk.c.h.a();
        if (a != null) {
            g b3 = a.b(str);
            if (b3 != null) {
                MBridgeConstans.OMID_JS_SERVICE_URL = b3.U();
                MBridgeConstans.OMID_JS_H5_URL = b3.T();
                if (!TextUtils.isEmpty(b3.y())) {
                    com.mbridge.msdk.foundation.same.net.e.d.f().f13398h = b3.y();
                    com.mbridge.msdk.foundation.same.net.e.d.f().b();
                }
                if (!TextUtils.isEmpty(b3.z())) {
                    com.mbridge.msdk.foundation.same.net.e.d.f().f13402l = b3.z();
                    com.mbridge.msdk.foundation.same.net.e.d.f().c();
                }
            } else {
                MBridgeConstans.OMID_JS_SERVICE_URL = com.mbridge.msdk.c.a.b.f12348b;
                MBridgeConstans.OMID_JS_H5_URL = com.mbridge.msdk.c.a.b.a;
            }
        }
        if (com.mbridge.msdk.c.h.a().d(str) && com.mbridge.msdk.c.h.a().a(str, 1, (String) null)) {
            if (com.mbridge.msdk.foundation.a.a.a.a().a("is_first_init", 0) == 0) {
                try {
                    com.mbridge.msdk.foundation.a.a.a.a().b("is_first_init", 1);
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.tools.e.c())) {
                        dVar.f13051b.postDelayed(new Runnable() { // from class: com.mbridge.msdk.foundation.controller.d.5
                            @Override // java.lang.Runnable
                            public final void run() {
                                new j().a(d.this.f13059k, str, d.this.f13057i);
                            }
                        }, 350L);
                    } else {
                        new j().a(dVar.f13059k, str, dVar.f13057i);
                    }
                    return;
                } catch (Throwable unused) {
                    new j().a(dVar.f13059k, str, dVar.f13057i);
                    return;
                }
            }
            new j().a(dVar.f13059k, str, dVar.f13057i);
        }
    }
}
