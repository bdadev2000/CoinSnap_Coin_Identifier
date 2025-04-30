package W1;

/* renamed from: W1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0318b implements N1.l {

    /* renamed from: c, reason: collision with root package name */
    public static final N1.h f3571c = N1.h.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* renamed from: d, reason: collision with root package name */
    public static final N1.h f3572d = new N1.h("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, N1.h.f2088e);
    public final Q1.f b;

    public C0318b(Q1.f fVar) {
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    @Override // N1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(java.lang.Object r9, java.io.File r10, N1.i r11) {
        /*
            r8 = this;
            P1.B r9 = (P1.B) r9
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            N1.h r1 = W1.C0318b.f3572d
            java.lang.Object r2 = r11.c(r1)
            android.graphics.Bitmap$CompressFormat r2 = (android.graphics.Bitmap.CompressFormat) r2
            if (r2 == 0) goto L15
            goto L20
        L15:
            boolean r2 = r9.hasAlpha()
            if (r2 == 0) goto L1e
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            goto L20
        L1e:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
        L20:
            r9.getWidth()
            r9.getHeight()
            int r3 = j2.i.b
            long r3 = android.os.SystemClock.elapsedRealtimeNanos()
            N1.h r5 = W1.C0318b.f3571c
            java.lang.Object r5 = r11.c(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            Q1.f r10 = r8.b
            if (r10 == 0) goto L51
            com.bumptech.glide.load.data.c r6 = new com.bumptech.glide.load.data.c     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f
            r6.<init>(r7, r10)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f
            goto L52
        L48:
            r6 = r7
            goto Lbe
        L4b:
            r6 = r7
            goto L63
        L4d:
            r9 = move-exception
            goto L48
        L4f:
            r10 = move-exception
            goto L4b
        L51:
            r6 = r7
        L52:
            r9.compress(r2, r5, r6)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r6.close()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r6.close()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            goto L5e
        L5c:
            r9 = move-exception
            goto Lc4
        L5e:
            r10 = 1
            goto L75
        L60:
            r9 = move-exception
            goto Lbe
        L62:
            r10 = move-exception
        L63:
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r0, r5)     // Catch: java.lang.Throwable -> L60
            if (r5 == 0) goto L6f
            java.lang.String r5 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r5, r10)     // Catch: java.lang.Throwable -> L60
        L6f:
            if (r6 == 0) goto L74
            r6.close()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L74
        L74:
            r10 = 0
        L75:
            r5 = 2
            boolean r5 = android.util.Log.isLoggable(r0, r5)
            if (r5 == 0) goto Lbd
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Compressed with type: "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = " of size "
            r5.append(r2)
            int r2 = j2.n.c(r9)
            r5.append(r2)
            java.lang.String r2 = " in "
            r5.append(r2)
            double r2 = j2.i.a(r3)
            r5.append(r2)
            java.lang.String r2 = ", options format: "
            r5.append(r2)
            java.lang.Object r11 = r11.c(r1)
            r5.append(r11)
            java.lang.String r11 = ", hasAlpha: "
            r5.append(r11)
            boolean r9 = r9.hasAlpha()
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            android.util.Log.v(r0, r9)
        Lbd:
            return r10
        Lbe:
            if (r6 == 0) goto Lc5
            r6.close()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> Lc5
            goto Lc5
        Lc4:
            throw r9
        Lc5:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.C0318b.m(java.lang.Object, java.io.File, N1.i):boolean");
    }

    @Override // N1.l
    public final int p(N1.i iVar) {
        return 2;
    }
}
