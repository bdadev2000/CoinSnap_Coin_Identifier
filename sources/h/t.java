package h;

import android.graphics.Bitmap;
import android.graphics.Movie;
import okio.BufferedSource;
import okio.Okio;

/* loaded from: classes4.dex */
public final class t extends kotlin.jvm.internal.r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f30702a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar) {
        super(0);
        this.f30702a = uVar;
    }

    @Override // q0.a
    public final Object invoke() {
        Bitmap.Config config;
        u uVar = this.f30702a;
        boolean z2 = uVar.f30705c;
        d0 d0Var = uVar.f30703a;
        BufferedSource buffer = z2 ? Okio.buffer(new q(d0Var.h())) : d0Var.h();
        try {
            Movie decodeStream = Movie.decodeStream(buffer.inputStream());
            kotlin.jvm.internal.q.b(buffer, null);
            if (decodeStream == null || decodeStream.width() <= 0 || decodeStream.height() <= 0) {
                throw new IllegalStateException("Failed to decode GIF.".toString());
            }
            boolean isOpaque = decodeStream.isOpaque();
            q.n nVar = uVar.f30704b;
            if (isOpaque && nVar.f31318g) {
                config = Bitmap.Config.RGB_565;
            } else {
                config = nVar.f31315b;
                if (config == Bitmap.Config.HARDWARE) {
                    config = Bitmap.Config.ARGB_8888;
                }
            }
            j.a aVar = new j.a(decodeStream, config, nVar.e);
            q.o oVar = nVar.f31323l;
            android.support.v4.media.d.C(oVar.f31328a.get("coil#repeat_count"));
            aVar.f30850r = -1;
            android.support.v4.media.d.C(oVar.f31328a.get("coil#animation_start_callback"));
            android.support.v4.media.d.C(oVar.f31328a.get("coil#animation_end_callback"));
            android.support.v4.media.d.C(oVar.f31328a.get("coil#animated_transformation"));
            aVar.f30851s = null;
            aVar.f30852t = t.a.f31364a;
            aVar.f30853u = false;
            aVar.invalidateSelf();
            return new h(aVar, false);
        } finally {
        }
    }
}
