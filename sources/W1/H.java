package W1;

import Q7.n0;
import a5.C0398b;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class H implements N1.k {

    /* renamed from: d, reason: collision with root package name */
    public static final N1.h f3563d = new N1.h("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new j());

    /* renamed from: e, reason: collision with root package name */
    public static final N1.h f3564e = new N1.h("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new k());

    /* renamed from: f, reason: collision with root package name */
    public static final C0398b f3565f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static final List f3566g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a, reason: collision with root package name */
    public final F f3567a;
    public final Q1.a b;

    /* renamed from: c, reason: collision with root package name */
    public final C0398b f3568c = f3565f;

    public H(Q1.a aVar, F f9) {
        this.b = aVar;
        this.f3567a = f9;
    }

    @Override // N1.k
    public final boolean a(Object obj, N1.i iVar) {
        return true;
    }

    @Override // N1.k
    public final P1.B b(Object obj, int i9, int i10, N1.i iVar) {
        long longValue = ((Long) iVar.c(f3563d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException(n0.g(longValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
        }
        Integer num = (Integer) iVar.c(f3564e);
        if (num == null) {
            num = 2;
        }
        o oVar = (o) iVar.c(o.f3583g);
        if (oVar == null) {
            oVar = o.f3582f;
        }
        o oVar2 = oVar;
        this.f3568c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f3567a.m(mediaMetadataRetriever, obj);
            return C0320d.b(this.b, c(obj, mediaMetadataRetriever, longValue, num.intValue(), i9, i10, oVar2));
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.release();
            } else {
                mediaMetadataRetriever.release();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:9|10|11|12|(2:14|(1:16)(3:17|18|19))|22|23|24|(5:31|32|33|(1:39)|37)|(1:45)|46|(3:79|(0)|(1:62)(2:63|64))(4:50|(3:53|(1:55)(1:77)|51)|78|(0)(0))|56|57|58|(3:66|67|(3:69|(1:71)|72))|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0184, code lost:
    
        if (android.util.Log.isLoggable("VideoDecoder", 3) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0186, code lost:
    
        android.util.Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0112, code lost:
    
        if (r0 < 33) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0072, code lost:
    
        if (r4 != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap c(java.lang.Object r15, android.media.MediaMetadataRetriever r16, long r17, int r19, int r20, int r21, W1.o r22) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.H.c(java.lang.Object, android.media.MediaMetadataRetriever, long, int, int, int, W1.o):android.graphics.Bitmap");
    }
}
