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

/* loaded from: classes3.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    private static volatile d f15407c;

    /* renamed from: d, reason: collision with root package name */
    private int f15409d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, Object> f15410e;

    /* renamed from: f, reason: collision with root package name */
    private FastKV f15411f;

    /* renamed from: h, reason: collision with root package name */
    private String f15413h;

    /* renamed from: i, reason: collision with root package name */
    private String f15414i;

    /* renamed from: j, reason: collision with root package name */
    private String f15415j;

    /* renamed from: k, reason: collision with root package name */
    private Context f15416k;
    private String l;
    private com.mbridge.msdk.b.a m;

    /* renamed from: n, reason: collision with root package name */
    private String f15417n;

    /* renamed from: a, reason: collision with root package name */
    public final int f15408a = 2;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15412g = false;
    Handler b = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.foundation.controller.d.6
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            List list;
            List list2;
            try {
                int i9 = message.what;
                if (i9 != 2) {
                    if (i9 != 7) {
                        if (i9 == 9) {
                            g gVar = (g) message.obj;
                            com.mbridge.msdk.foundation.tools.g d2 = c.m().d();
                            if (d2 != null && d2.b() && gVar != null && gVar.I() == 1) {
                                com.mbridge.msdk.foundation.same.report.b.d.a(d.this.f15416k).b();
                            }
                            if (d2 != null && d2.a()) {
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
                    h hVar = new h(d.this.f15416k, 0);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        l lVar = (l) list.get(i10);
                        Boolean bool = Boolean.FALSE;
                        if (i10 == list.size() - 1) {
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
        if (f15407c == null) {
            synchronized (d.class) {
                try {
                    if (f15407c == null) {
                        f15407c = new d();
                    }
                } finally {
                }
            }
        }
        return f15407c;
    }

    public final void b() {
        List<l> a6;
        if (this.f15416k == null || this.b == null) {
            return;
        }
        try {
            int i9 = af.a().a("e_r_r_c_t_r_l", false) ? 5 : 1;
            com.mbridge.msdk.foundation.same.report.c.a.a();
            Context context = this.f15416k;
            if (context != null && com.mbridge.msdk.foundation.db.l.a(com.mbridge.msdk.foundation.db.g.a(context)).a() > 0) {
                a6 = com.mbridge.msdk.foundation.db.l.a(com.mbridge.msdk.foundation.db.g.a(context)).a(i9);
                if (a6 != null || a6.size() <= 0) {
                }
                Message obtainMessage = this.b.obtainMessage();
                obtainMessage.what = 2;
                obtainMessage.obj = a6;
                this.b.sendMessage(obtainMessage);
                return;
            }
            a6 = null;
            if (a6 != null) {
            }
        } catch (Exception unused) {
            if (MBridgeConstans.DEBUG) {
                ad.b("SDKController", "report netstate error !");
            }
        }
    }

    public final void c() {
        Handler handler = this.b;
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
                    this.f15413h = (String) map.get(MBridgeConstans.ID_MBRIDGE_APPID);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_APPKEY)) {
                    this.f15414i = (String) map.get(MBridgeConstans.ID_MBRIDGE_APPKEY);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_WX_APPID)) {
                    this.f15417n = (String) map.get(MBridgeConstans.ID_MBRIDGE_WX_APPID);
                }
                if (map.containsKey(MBridgeConstans.PACKAGE_NAME_MANIFEST)) {
                    this.f15415j = (String) map.get(MBridgeConstans.PACKAGE_NAME_MANIFEST);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH)) {
                    this.l = (String) map.get(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH);
                }
            }
            this.f15416k = context.getApplicationContext();
            c.m().b(this.f15416k);
            c.m().d(this.f15413h);
            c.m().e(this.f15414i);
            c.m().a(this.f15417n);
            c.m().c(this.f15415j);
            c.m().a(new a.InterfaceC0156a() { // from class: com.mbridge.msdk.foundation.controller.d.4
            }, this.b);
            try {
                com.mbridge.msdk.foundation.same.net.e.d.f().e();
            } catch (Throwable th) {
                ad.b("SDKController", th.getMessage());
            }
            if (this.f15412g) {
                return;
            }
            ag.a(this.f15416k);
            Context applicationContext = this.f15416k.getApplicationContext();
            try {
                if (this.f15411f == null) {
                    try {
                        this.f15411f = new FastKV.Builder(com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), x.a("H+tU+FeXHM==")).build();
                    } catch (Exception unused) {
                        this.f15411f = null;
                    }
                }
                FastKV fastKV = this.f15411f;
                String str3 = "";
                if (fastKV != null) {
                    String string = fastKV.getString(x.a("H+tU+bfPhM=="), "");
                    String string2 = this.f15411f.getString(x.a("H+tU+Fz8"), "");
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f15673U) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f15681g)) {
                        com.mbridge.msdk.foundation.same.a.f15673U = com.mbridge.msdk.foundation.a.a.a.a().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                        com.mbridge.msdk.foundation.same.a.f15681g = com.mbridge.msdk.foundation.a.a.a.a().a(a.f15376a);
                    }
                    if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2)) {
                        if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f15673U) || !TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f15681g)) {
                            this.f15411f.putString(x.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.f15673U);
                            this.f15411f.putString(x.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f15681g);
                        }
                    } else {
                        com.mbridge.msdk.foundation.same.a.f15673U = string;
                        com.mbridge.msdk.foundation.same.a.f15681g = string2;
                        com.mbridge.msdk.foundation.a.a.a.a().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.f15673U);
                        com.mbridge.msdk.foundation.a.a.a.a().a(a.f15376a, com.mbridge.msdk.foundation.same.a.f15681g);
                    }
                } else {
                    SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(x.a("H+tU+FeXHM=="), 0);
                    if (sharedPreferences != null) {
                        str3 = sharedPreferences.getString(x.a("H+tU+bfPhM=="), "");
                        str = sharedPreferences.getString(x.a("H+tU+Fz8"), "");
                    } else {
                        str = "";
                    }
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f15673U) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f15681g)) {
                        com.mbridge.msdk.foundation.same.a.f15673U = com.mbridge.msdk.foundation.a.a.a.a().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                        com.mbridge.msdk.foundation.same.a.f15681g = com.mbridge.msdk.foundation.a.a.a.a().a(a.f15376a);
                    }
                    if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str)) {
                        if ((!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f15673U) || !TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f15681g)) && sharedPreferences != null) {
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putString(x.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.f15673U);
                            edit.putString(x.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f15681g);
                            edit.apply();
                        }
                    } else {
                        com.mbridge.msdk.foundation.same.a.f15673U = str3;
                        com.mbridge.msdk.foundation.same.a.f15681g = str;
                        com.mbridge.msdk.foundation.a.a.a.a().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.f15673U);
                        com.mbridge.msdk.foundation.a.a.a.a().a(a.f15376a, com.mbridge.msdk.foundation.same.a.f15681g);
                    }
                }
            } catch (Throwable th2) {
                ad.b("SDKController", th2.getMessage(), th2);
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
                        d.a(dVar, dVar.f15413h);
                        if (!TextUtils.isEmpty(d.this.f15413h)) {
                            com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.SDK_APP_ID, d.this.f15413h);
                        }
                        new h(d.this.f15416k).a();
                        d.this.b();
                    }
                });
                i.c();
            } catch (Exception unused2) {
                ad.b("SDKController", "get app setting failed");
            }
            this.f15412g = true;
            z.f(context);
            long ax = com.mbridge.msdk.c.h.a().a(this.f15413h).ax();
            if (ax != 1300) {
                this.b.postDelayed(new Runnable() { // from class: com.mbridge.msdk.foundation.controller.d.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        z.d(context);
                    }
                }, ax);
            }
        }
    }

    public static /* synthetic */ void b(d dVar) {
        List<com.mbridge.msdk.foundation.entity.a> k6;
        Object newInstance;
        Object newInstance2;
        try {
            g b = com.mbridge.msdk.c.h.a().b(c.m().k());
            if (b == null || (k6 = b.k()) == null || k6.size() <= 0) {
                return;
            }
            for (com.mbridge.msdk.foundation.entity.a aVar : k6) {
                if (aVar.a() == 287) {
                    if (dVar.f15416k != null && (newInstance = MBInterstitialVideoHandler.class.getConstructor(String.class, String.class).newInstance("", aVar.b())) != null) {
                        MBInterstitialVideoHandler.class.getMethod("loadFormSelfFilling", null).invoke(newInstance, null);
                    }
                } else if (aVar.a() == 94 && (newInstance2 = MBRewardVideoHandler.class.getConstructor(String.class, String.class).newInstance("", aVar.b())) != null) {
                    MBRewardVideoHandler.class.getMethod("loadFormSelfFilling", null).invoke(newInstance2, null);
                }
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0082 -> B:30:0x0085). Please report as a decompilation issue!!! */
    public final void a(Map<String, Object> map, int i9) {
        if (MBridgeSDKFactory.getMBridgeSDK().getStatus() != MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            ad.b("SDKController", "preloaad failed,sdk do not inited");
            return;
        }
        this.f15410e = map;
        this.f15409d = i9;
        c.m().k();
        if (map != null) {
            if (this.m == null) {
                this.m = new com.mbridge.msdk.b.a();
            }
            try {
                Map<String, Object> map2 = this.f15410e;
                if (map2 != null && map2.size() > 0 && this.f15410e.containsKey(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)) {
                    int intValue = ((Integer) this.f15410e.get(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)).intValue();
                    if (intValue == 0) {
                        Map<String, Object> map3 = this.f15410e;
                        int i10 = this.f15409d;
                        try {
                            com.mbridge.msdk.mbnative.f.a.class.getMethod("preload", Map.class, Integer.TYPE).invoke(com.mbridge.msdk.mbnative.f.a.class.newInstance(), map3, Integer.valueOf(i10));
                        } catch (Exception unused) {
                        }
                    } else if (1 != intValue && 2 != intValue) {
                        ad.b("SDKController", "unknow layout type in preload");
                    }
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    public static /* synthetic */ void a(d dVar) {
        try {
            com.mbridge.msdk.d.b.class.getDeclaredMethod("start", null).invoke(com.mbridge.msdk.d.b.class.getMethod("getInstance", null).invoke(null, null), null);
        } catch (Throwable th) {
            ad.b("SDKController", th.getMessage(), th);
        }
    }

    public static /* synthetic */ void a(d dVar, final String str) {
        if (com.mbridge.msdk.c.h.a() == null) {
            return;
        }
        com.mbridge.msdk.c.h a6 = com.mbridge.msdk.c.h.a();
        if (a6 != null) {
            g b = a6.b(str);
            if (b != null) {
                MBridgeConstans.OMID_JS_SERVICE_URL = b.U();
                MBridgeConstans.OMID_JS_H5_URL = b.T();
                if (!TextUtils.isEmpty(b.y())) {
                    com.mbridge.msdk.foundation.same.net.e.d.f().f15832h = b.y();
                    com.mbridge.msdk.foundation.same.net.e.d.f().b();
                }
                if (!TextUtils.isEmpty(b.z())) {
                    com.mbridge.msdk.foundation.same.net.e.d.f().l = b.z();
                    com.mbridge.msdk.foundation.same.net.e.d.f().c();
                }
            } else {
                MBridgeConstans.OMID_JS_SERVICE_URL = com.mbridge.msdk.c.a.b.b;
                MBridgeConstans.OMID_JS_H5_URL = com.mbridge.msdk.c.a.b.f14611a;
            }
        }
        if (com.mbridge.msdk.c.h.a().d(str) && com.mbridge.msdk.c.h.a().a(str, 1, (String) null)) {
            if (com.mbridge.msdk.foundation.a.a.a.a().a("is_first_init", 0) == 0) {
                try {
                    com.mbridge.msdk.foundation.a.a.a.a().b("is_first_init", 1);
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.tools.e.c())) {
                        dVar.b.postDelayed(new Runnable() { // from class: com.mbridge.msdk.foundation.controller.d.5
                            @Override // java.lang.Runnable
                            public final void run() {
                                new j().a(d.this.f15416k, str, d.this.f15414i);
                            }
                        }, 350L);
                    } else {
                        new j().a(dVar.f15416k, str, dVar.f15414i);
                    }
                    return;
                } catch (Throwable unused) {
                    new j().a(dVar.f15416k, str, dVar.f15414i);
                    return;
                }
            }
            new j().a(dVar.f15416k, str, dVar.f15414i);
        }
    }
}
