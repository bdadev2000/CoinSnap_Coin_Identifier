package m9;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public int f21716c;

    /* renamed from: d, reason: collision with root package name */
    public int f21717d;
    public final boolean a = true;

    /* renamed from: b, reason: collision with root package name */
    public final int f21715b = C.DEFAULT_BUFFER_SEGMENT_SIZE;

    /* renamed from: e, reason: collision with root package name */
    public int f21718e = 0;

    /* renamed from: f, reason: collision with root package name */
    public a[] f21719f = new a[100];

    public final synchronized void a() {
        int i10 = this.f21716c;
        int i11 = this.f21715b;
        int i12 = n9.h0.a;
        int max = Math.max(0, (((i10 + i11) - 1) / i11) - this.f21717d);
        int i13 = this.f21718e;
        if (max >= i13) {
            return;
        }
        Arrays.fill(this.f21719f, max, i13, (Object) null);
        this.f21718e = max;
    }
}
