package com.pgl.ssdk.ces.out;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.pgl.ssdk.AbstractC1260c;
import com.pgl.ssdk.C1277u;
import com.pgl.ssdk.C1278v;
import com.pgl.ssdk.S;
import com.pgl.ssdk.ces.a;
import com.pgl.ssdk.ces.b;
import com.pgl.ssdk.ces.c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class PglSSManager {
    public static final int INIT_STATUS_FAIL_CONTEXT_NULL = 4;
    public static final int INIT_STATUS_FAIL_SO_LOADFAIL = 3;
    public static final int INIT_STATUS_FAIL_SO_MISSING = 2;
    public static final int INIT_STATUS_OK = 0;
    public static final int INIT_STATUS_UNINITIALIZE = 1;

    /* renamed from: c, reason: collision with root package name */
    private static volatile PglSSManager f16555c;
    private final c a;

    /* renamed from: b, reason: collision with root package name */
    private volatile int f16556b = 0;

    private PglSSManager(Context context, PglSSConfig pglSSConfig) {
        this.a = c.a(context, pglSSConfig.getAppId(), pglSSConfig.getOVRegionType(), pglSSConfig.getCollectMode(), pglSSConfig.getAdSdkVersionCode());
    }

    public static int getInitStatus() {
        return c.f();
    }

    public static PglSSManager getInstance() {
        return f16555c;
    }

    public static String getLoadError() {
        if (c.h() != null) {
            return c.h().f16525b;
        }
        return null;
    }

    @DungeonFlag
    public static PglSSManager init(Context context, PglSSConfig pglSSConfig, String str, String str2, String str3, String str4) {
        if (context == null && pglSSConfig == null) {
            return null;
        }
        if (f16555c == null) {
            synchronized (PglSSManager.class) {
                if (f16555c == null) {
                    f16555c = new PglSSManager(context, pglSSConfig);
                    if (c.f() == 0) {
                        f16555c.a.a(str, str3, str2, str4);
                    }
                }
            }
        }
        return f16555c;
    }

    public void checkEventVirtual(MotionEvent motionEvent) {
        if (c.f() == 0) {
            C1277u.a(motionEvent, this.a.a);
        }
    }

    public long getECForBidding() {
        if (c.f() != 0) {
            return 0L;
        }
        try {
            return ((Long) a.meta(154, this.a.a, null)).longValue();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public Map<String, String> getFeatureHash(String str, byte[] bArr) {
        if (c.f() == 0) {
            c cVar = this.a;
            cVar.getClass();
            HashMap hashMap = new HashMap();
            Object[] objArr = new Object[2];
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            if (bArr == null) {
                bArr = new byte[0];
            }
            objArr[1] = bArr;
            String str2 = (String) a.meta(224, cVar.a, objArr);
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("X-Armors", str2);
            }
            return hashMap;
        }
        return null;
    }

    public String getSofChara() {
        if (c.f() == 0) {
            this.a.getClass();
            return C1278v.c();
        }
        return null;
    }

    public String getToken() {
        if (c.f() == 0) {
            this.a.getClass();
            return S.b();
        }
        return null;
    }

    public void reportNow(String str) {
        if (c.f() == 0) {
            if (this.f16556b % 5 == 0) {
                this.a.a(str);
            }
            this.f16556b++;
            this.a.c();
        }
    }

    public void setCnReportUrl(String str, boolean z10) {
        if (c.f() == 0) {
            c cVar = this.a;
            cVar.getClass();
            if (str != null && !str.equals(b.a) && z10) {
                cVar.a("updateUrl");
            }
            b.a = str;
        }
    }

    public void setCnTokenUrl(String str, boolean z10) {
        if (c.f() == 0) {
            this.a.getClass();
            if (str != null && !str.equals(b.f16533b) && z10) {
                S.c();
            }
            b.f16533b = str;
        }
    }

    public void setCustomInfo(Map<String, Object> map) {
        if (c.f() == 0) {
            this.a.a(map);
            AbstractC1260c.a(new Runnable() { // from class: com.pgl.ssdk.ces.out.PglSSManager.1
                @Override // java.lang.Runnable
                public void run() {
                    PglSSManager.this.a.b();
                }
            });
        }
    }

    public void setDeviceId(String str) {
        if (c.f() == 0) {
            this.a.b(str);
        }
    }

    public void setGaid(String str) {
        if (c.f() == 0) {
            this.a.c(str);
        }
    }

    public void setOaid(String str) {
        if (c.f() == 0) {
            this.a.d(str);
        }
    }
}
