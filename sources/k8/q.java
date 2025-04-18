package k8;

import s7.r0;

/* loaded from: classes3.dex */
public final class q extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final String f20336b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20337c;

    /* renamed from: d, reason: collision with root package name */
    public final o f20338d;

    /* renamed from: f, reason: collision with root package name */
    public final String f20339f;

    public q(int i10, r0 r0Var, w wVar, boolean z10) {
        this("Decoder init failed: [" + i10 + "], " + r0Var, wVar, r0Var.f24723n, z10, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public q(String str, Throwable th2, String str2, boolean z10, o oVar, String str3) {
        super(str, th2);
        this.f20336b = str2;
        this.f20337c = z10;
        this.f20338d = oVar;
        this.f20339f = str3;
    }
}
