package w7;

import android.media.MediaCodec;
import n9.h0;

/* loaded from: classes3.dex */
public final class d {
    public byte[] a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f26869b;

    /* renamed from: c, reason: collision with root package name */
    public int f26870c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f26871d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f26872e;

    /* renamed from: f, reason: collision with root package name */
    public int f26873f;

    /* renamed from: g, reason: collision with root package name */
    public int f26874g;

    /* renamed from: h, reason: collision with root package name */
    public int f26875h;

    /* renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f26876i;

    /* renamed from: j, reason: collision with root package name */
    public final c f26877j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f26876i = cryptoInfo;
        if (h0.a >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f26877j = cVar;
    }
}
