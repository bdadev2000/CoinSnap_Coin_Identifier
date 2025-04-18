package com.applovin.impl;

import com.android.volley.DefaultRetryPolicy;
import com.facebook.appevents.AppEventsConstants;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public class f6 implements lc {

    /* renamed from: a, reason: collision with root package name */
    private final r5 f23815a;

    /* renamed from: b, reason: collision with root package name */
    private final long f23816b;

    /* renamed from: c, reason: collision with root package name */
    private final long f23817c;
    private final long d;
    private final long e;

    /* renamed from: f, reason: collision with root package name */
    private final int f23818f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f23819g;

    /* renamed from: h, reason: collision with root package name */
    private final long f23820h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f23821i;

    /* renamed from: j, reason: collision with root package name */
    private int f23822j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f23823k;

    public f6() {
        this(new r5(true, 65536), 50000, 50000, DefaultRetryPolicy.DEFAULT_TIMEOUT_MS, 5000, -1, false, 0, false);
    }

    @Override // com.applovin.impl.lc
    public boolean a() {
        return this.f23821i;
    }

    @Override // com.applovin.impl.lc
    public n0 b() {
        return this.f23815a;
    }

    @Override // com.applovin.impl.lc
    public void c() {
        a(true);
    }

    @Override // com.applovin.impl.lc
    public long d() {
        return this.f23820h;
    }

    @Override // com.applovin.impl.lc
    public void e() {
        a(true);
    }

    @Override // com.applovin.impl.lc
    public void f() {
        a(false);
    }

    public f6(r5 r5Var, int i2, int i3, int i4, int i5, int i6, boolean z2, int i7, boolean z3) {
        a(i4, 0, "bufferForPlaybackMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        a(i5, 0, "bufferForPlaybackAfterRebufferMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        a(i2, i4, "minBufferMs", "bufferForPlaybackMs");
        a(i2, i5, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i3, i2, "maxBufferMs", "minBufferMs");
        a(i7, 0, "backBufferDurationMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        this.f23815a = r5Var;
        this.f23816b = t2.a(i2);
        this.f23817c = t2.a(i3);
        this.d = t2.a(i4);
        this.e = t2.a(i5);
        this.f23818f = i6;
        this.f23822j = i6 == -1 ? 13107200 : i6;
        this.f23819g = z2;
        this.f23820h = t2.a(i7);
        this.f23821i = z3;
    }

    private static void a(int i2, int i3, String str, String str2) {
        b1.a(i2 >= i3, str + " cannot be less than " + str2);
    }

    public int a(qi[] qiVarArr, h8[] h8VarArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < qiVarArr.length; i3++) {
            if (h8VarArr[i3] != null) {
                i2 += a(qiVarArr[i3].e());
            }
        }
        return Math.max(13107200, i2);
    }

    private static int a(int i2) {
        switch (i2) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return Opcodes.ACC_DEPRECATED;
        }
    }

    @Override // com.applovin.impl.lc
    public void a(qi[] qiVarArr, po poVar, h8[] h8VarArr) {
        int i2 = this.f23818f;
        if (i2 == -1) {
            i2 = a(qiVarArr, h8VarArr);
        }
        this.f23822j = i2;
        this.f23815a.a(i2);
    }

    private void a(boolean z2) {
        int i2 = this.f23818f;
        if (i2 == -1) {
            i2 = 13107200;
        }
        this.f23822j = i2;
        this.f23823k = false;
        if (z2) {
            this.f23815a.e();
        }
    }

    @Override // com.applovin.impl.lc
    public boolean a(long j2, long j3, float f2) {
        boolean z2 = true;
        boolean z3 = this.f23815a.d() >= this.f23822j;
        long j4 = this.f23816b;
        if (f2 > 1.0f) {
            j4 = Math.min(xp.a(j4, f2), this.f23817c);
        }
        if (j3 < Math.max(j4, 500000L)) {
            if (!this.f23819g && z3) {
                z2 = false;
            }
            this.f23823k = z2;
            if (!z2 && j3 < 500000) {
                pc.d("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j3 >= this.f23817c || z3) {
            this.f23823k = false;
        }
        return this.f23823k;
    }

    @Override // com.applovin.impl.lc
    public boolean a(long j2, float f2, boolean z2, long j3) {
        long b2 = xp.b(j2, f2);
        long j4 = z2 ? this.e : this.d;
        if (j3 != -9223372036854775807L) {
            j4 = Math.min(j3 / 2, j4);
        }
        return j4 <= 0 || b2 >= j4 || (!this.f23819g && this.f23815a.d() >= this.f23822j);
    }
}
