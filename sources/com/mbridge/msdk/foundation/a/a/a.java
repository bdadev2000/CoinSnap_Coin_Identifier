package com.mbridge.msdk.foundation.a.a;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f15333a = "a";

    /* renamed from: c, reason: collision with root package name */
    private static a f15334c;
    FastKV b;

    private a() {
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            try {
                if (f15334c == null) {
                    f15334c = new a();
                }
                aVar = f15334c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public final Long b(String str) {
        try {
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.a(f15333a, "getLong error: " + e4.getMessage());
            }
        }
        if (c.m().c() == null) {
            ad.b(f15333a, "context is null in get");
            return 0L;
        }
        b();
        FastKV fastKV = this.b;
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
        FastKV fastKV = this.b;
        if (fastKV != null) {
            try {
                fastKV.remove(str);
            } catch (Exception unused) {
            }
        }
    }

    public final String a(String str) {
        try {
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.a(f15333a, "get error: " + e4.getMessage());
            }
        }
        if (c.m().c() == null) {
            return null;
        }
        b();
        FastKV fastKV = this.b;
        if (fastKV != null) {
            try {
                return fastKV.getString(str, "");
            } catch (Exception unused) {
                return "";
            }
        }
        return null;
    }

    public final int a(String str, int i9) {
        try {
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.a(f15333a, "getInt error: " + e4.getMessage());
            }
        }
        if (c.m().c() == null) {
            return i9;
        }
        b();
        FastKV fastKV = this.b;
        if (fastKV != null) {
            try {
                return fastKV.getInt(str, i9);
            } catch (Exception unused) {
                return i9;
            }
        }
        return i9;
    }

    public final void b(String str, int i9) {
        try {
            if (c.m().c() == null) {
                return;
            }
            b();
            FastKV fastKV = this.b;
            if (fastKV != null) {
                try {
                    fastKV.putInt(str, i9);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    private void b() {
        if (this.b == null) {
            try {
                this.b = new FastKV.Builder(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), "mbridge").build();
            } catch (Exception unused) {
                this.b = null;
            }
        }
    }

    public final void a(String str, String str2) {
        try {
            if (c.m().c() == null) {
                return;
            }
            b();
            FastKV fastKV = this.b;
            if (fastKV != null) {
                try {
                    fastKV.putString(str, str2);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.a(f15333a, "put error: " + e4.getMessage());
            }
        }
    }

    public final void a(String str, long j7) {
        try {
            if (c.m().c() == null) {
                ad.b(f15333a, "context is null in put");
                return;
            }
            b();
            FastKV fastKV = this.b;
            if (fastKV != null) {
                try {
                    fastKV.putLong(str, j7);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.a(f15333a, "putLong error: " + e4.getMessage());
            }
        }
    }
}
