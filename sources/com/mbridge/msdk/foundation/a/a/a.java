package com.mbridge.msdk.foundation.a.a;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class a {
    public static final String a = "a";

    /* renamed from: c, reason: collision with root package name */
    private static a f12975c;

    /* renamed from: b, reason: collision with root package name */
    FastKV f12976b;

    private a() {
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (f12975c == null) {
                f12975c = new a();
            }
            aVar = f12975c;
        }
        return aVar;
    }

    public final Long b(String str) {
        try {
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.a(a, "getLong error: " + e2.getMessage());
            }
        }
        if (c.m().c() == null) {
            ad.b(a, "context is null in get");
            return 0L;
        }
        b();
        FastKV fastKV = this.f12976b;
        if (fastKV != null) {
            try {
                return Long.valueOf(fastKV.getLong(str, 0L));
            } catch (Exception unused) {
                return 0L;
            }
        }
        return 0L;
    }

    public final void c(String str) {
        if (c.m().c() == null) {
            return;
        }
        b();
        FastKV fastKV = this.f12976b;
        if (fastKV != null) {
            try {
                fastKV.remove(str);
            } catch (Exception unused) {
            }
        }
    }

    public final String a(String str) {
        try {
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.a(a, "get error: " + e2.getMessage());
            }
        }
        if (c.m().c() == null) {
            return null;
        }
        b();
        FastKV fastKV = this.f12976b;
        if (fastKV != null) {
            try {
                return fastKV.getString(str, "");
            } catch (Exception unused) {
                return "";
            }
        }
        return null;
    }

    public final int a(String str, int i10) {
        try {
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.a(a, "getInt error: " + e2.getMessage());
            }
        }
        if (c.m().c() == null) {
            return i10;
        }
        b();
        FastKV fastKV = this.f12976b;
        if (fastKV != null) {
            try {
                return fastKV.getInt(str, i10);
            } catch (Exception unused) {
                return i10;
            }
        }
        return i10;
    }

    public final void b(String str, int i10) {
        try {
            if (c.m().c() == null) {
                return;
            }
            b();
            FastKV fastKV = this.f12976b;
            if (fastKV != null) {
                try {
                    fastKV.putInt(str, i10);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void b() {
        if (this.f12976b == null) {
            try {
                this.f12976b = new FastKV.Builder(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), "mbridge").build();
            } catch (Exception unused) {
                this.f12976b = null;
            }
        }
    }

    public final void a(String str, String str2) {
        try {
            if (c.m().c() == null) {
                return;
            }
            b();
            FastKV fastKV = this.f12976b;
            if (fastKV != null) {
                try {
                    fastKV.putString(str, str2);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.a(a, "put error: " + e2.getMessage());
            }
        }
    }

    public final void a(String str, long j3) {
        try {
            if (c.m().c() == null) {
                ad.b(a, "context is null in put");
                return;
            }
            b();
            FastKV fastKV = this.f12976b;
            if (fastKV != null) {
                try {
                    fastKV.putLong(str, j3);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.a(a, "putLong error: " + e2.getMessage());
            }
        }
    }
}
