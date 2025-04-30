package com.pgl.ssdk.ces.out;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.pgl.ssdk.AbstractC2049c;
import com.pgl.ssdk.C2066u;
import com.pgl.ssdk.Q;
import com.pgl.ssdk.ces.a;
import com.pgl.ssdk.ces.b;
import com.pgl.ssdk.ces.c;
import com.pgl.ssdk.v;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class PglSSManager {
    public static final int INIT_STATUS_FAIL_CONTEXT_NULL = 4;
    public static final int INIT_STATUS_FAIL_SO_LOADFAIL = 3;
    public static final int INIT_STATUS_FAIL_SO_MISSING = 2;
    public static final int INIT_STATUS_OK = 0;
    public static final int INIT_STATUS_UNINITIALIZE = 1;

    /* renamed from: c, reason: collision with root package name */
    private static volatile PglSSManager f19577c;

    /* renamed from: a, reason: collision with root package name */
    private final c f19578a;
    private volatile int b = 0;

    private PglSSManager(Context context, PglSSConfig pglSSConfig) {
        this.f19578a = c.a(context, pglSSConfig.getAppId(), pglSSConfig.getOVRegionType(), pglSSConfig.getCollectMode(), pglSSConfig.getAdSdkVersionCode());
    }

    public static int getInitStatus() {
        return c.e();
    }

    public static PglSSManager getInstance() {
        return f19577c;
    }

    public static String getLoadError() {
        if (c.g() != null) {
            return c.g().b;
        }
        return null;
    }

    @DungeonFlag
    public static PglSSManager init(Context context, PglSSConfig pglSSConfig, String str, String str2, String str3, String str4) {
        if (context == null && pglSSConfig == null) {
            return null;
        }
        if (f19577c == null) {
            synchronized (PglSSManager.class) {
                try {
                    if (f19577c == null) {
                        f19577c = new PglSSManager(context, pglSSConfig);
                        if (c.e() == 0) {
                            f19577c.f19578a.a(str, str3, str2, str4);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f19577c;
    }

    public void checkEventVirtual(MotionEvent motionEvent) {
        if (c.e() == 0) {
            C2066u.a(motionEvent, this.f19578a.f19560a);
        }
    }

    public Map<String, String> getFeatureHash(String str, byte[] bArr) {
        if (c.e() == 0) {
            c cVar = this.f19578a;
            cVar.getClass();
            HashMap hashMap = new HashMap();
            if (str == null) {
                str = "";
            }
            if (bArr == null) {
                bArr = new byte[0];
            }
            String str2 = (String) a.meta(224, cVar.f19560a, new Object[]{str, bArr});
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("X-Armors", str2);
            }
            return hashMap;
        }
        return null;
    }

    public String getSofChara() {
        if (c.e() == 0) {
            this.f19578a.getClass();
            return v.c();
        }
        return null;
    }

    public String getToken() {
        if (c.e() == 0) {
            this.f19578a.getClass();
            return Q.b();
        }
        return null;
    }

    public void reportNow(String str) {
        if (c.e() == 0) {
            if (this.b % 5 == 0) {
                this.f19578a.a(str);
            }
            this.b++;
        }
    }

    public void setCnReportUrl(String str, boolean z8) {
        if (c.e() == 0) {
            c cVar = this.f19578a;
            cVar.getClass();
            if (str != null && !str.equals(b.f19555a) && z8) {
                cVar.a("updateUrl");
            }
            b.f19555a = str;
        }
    }

    public void setCnTokenUrl(String str, boolean z8) {
        if (c.e() == 0) {
            this.f19578a.getClass();
            if (str != null && !str.equals(b.b) && z8) {
                Q.c();
            }
            b.b = str;
        }
    }

    public void setCustomInfo(Map<String, Object> map) {
        if (c.e() == 0) {
            this.f19578a.a(map);
            AbstractC2049c.a(new Runnable() { // from class: com.pgl.ssdk.ces.out.PglSSManager.1
                @Override // java.lang.Runnable
                public void run() {
                    PglSSManager.this.f19578a.b();
                }
            });
        }
    }

    public void setDeviceId(String str) {
        if (c.e() == 0) {
            this.f19578a.b(str);
        }
    }

    public void setGaid(String str) {
        if (c.e() == 0) {
            this.f19578a.c(str);
        }
    }

    public void setOaid(String str) {
        if (c.e() == 0) {
            this.f19578a.d(str);
        }
    }
}
