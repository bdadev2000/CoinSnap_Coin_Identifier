package n4;

import android.media.MediaMetadataRetriever;
import android.os.Build;
import g4.g0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f0 implements e4.o {

    /* renamed from: d, reason: collision with root package name */
    public static final e4.l f22410d = new e4.l("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new b0(0));

    /* renamed from: e, reason: collision with root package name */
    public static final e4.l f22411e = new e4.l("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b0(1));

    /* renamed from: f, reason: collision with root package name */
    public static final z1.d f22412f = new z1.d(20);

    /* renamed from: g, reason: collision with root package name */
    public static final List f22413g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));
    public final d0 a;

    /* renamed from: b, reason: collision with root package name */
    public final h4.d f22414b;

    /* renamed from: c, reason: collision with root package name */
    public final z1.d f22415c = f22412f;

    public f0(h4.d dVar, d0 d0Var) {
        this.f22414b = dVar;
        this.a = d0Var;
    }

    @Override // e4.o
    public final boolean a(Object obj, e4.m mVar) {
        return true;
    }

    @Override // e4.o
    public final g0 b(Object obj, int i10, int i11, e4.m mVar) {
        long longValue = ((Long) mVar.c(f22410d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
        Integer num = (Integer) mVar.c(f22411e);
        if (num == null) {
            num = 2;
        }
        n nVar = (n) mVar.c(n.f22425f);
        if (nVar == null) {
            nVar = n.f22424e;
        }
        n nVar2 = nVar;
        this.f22415c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.a.q(mediaMetadataRetriever, obj);
            return d.b(c(obj, mediaMetadataRetriever, longValue, num.intValue(), i10, i11, nVar2), this.f22414b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.close();
            } else {
                mediaMetadataRetriever.release();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0110, code lost:
    
        if (r0 < 33) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap c(java.lang.Object r17, android.media.MediaMetadataRetriever r18, long r19, int r21, int r22, int r23, n4.n r24) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.f0.c(java.lang.Object, android.media.MediaMetadataRetriever, long, int, int, int, n4.n):android.graphics.Bitmap");
    }
}
