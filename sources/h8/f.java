package h8;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import n9.x;

/* loaded from: classes3.dex */
public final class f {
    public final g a = new g();

    /* renamed from: b, reason: collision with root package name */
    public final x f18888b = new x(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);

    /* renamed from: c, reason: collision with root package name */
    public int f18889c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f18890d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18891e;

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005b, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(y7.m r11) {
        /*
            r10 = this;
            boolean r0 = r10.f18891e
            r1 = 0
            n9.x r2 = r10.f18888b
            if (r0 == 0) goto Lc
            r10.f18891e = r1
            r2.D(r1)
        Lc:
            boolean r0 = r10.f18891e
            r3 = 1
            if (r0 != 0) goto La9
            int r0 = r10.f18889c
            r4 = 255(0xff, float:3.57E-43)
            h8.g r5 = r10.a
            if (r0 >= 0) goto L5c
            r6 = -1
            boolean r0 = r5.b(r11, r6)
            if (r0 == 0) goto L5b
            boolean r0 = r5.a(r11, r3)
            if (r0 != 0) goto L28
            goto L5b
        L28:
            int r0 = r5.f18894d
            int r6 = r5.a
            r6 = r6 & r3
            if (r6 != r3) goto L4e
            int r6 = r2.f22600c
            if (r6 != 0) goto L4e
            r10.f18890d = r1
            r6 = r1
        L36:
            int r7 = r10.f18890d
            int r8 = r1 + r7
            int r9 = r5.f18893c
            if (r8 >= r9) goto L49
            int r7 = r7 + 1
            r10.f18890d = r7
            int[] r7 = r5.f18896f
            r7 = r7[r8]
            int r6 = r6 + r7
            if (r7 == r4) goto L36
        L49:
            int r0 = r0 + r6
            int r6 = r10.f18890d
            int r6 = r6 + r1
            goto L4f
        L4e:
            r6 = r1
        L4f:
            r11.skipFully(r0)     // Catch: java.io.EOFException -> L54
            r0 = r3
            goto L55
        L54:
            r0 = r1
        L55:
            if (r0 != 0) goto L58
            return r1
        L58:
            r10.f18889c = r6
            goto L5c
        L5b:
            return r1
        L5c:
            int r0 = r10.f18889c
            r10.f18890d = r1
            r6 = r1
        L61:
            int r7 = r10.f18890d
            int r8 = r0 + r7
            int r9 = r5.f18893c
            if (r8 >= r9) goto L74
            int r7 = r7 + 1
            r10.f18890d = r7
            int[] r7 = r5.f18896f
            r7 = r7[r8]
            int r6 = r6 + r7
            if (r7 == r4) goto L61
        L74:
            int r0 = r10.f18889c
            int r7 = r10.f18890d
            int r0 = r0 + r7
            if (r6 <= 0) goto La0
            int r7 = r2.f22600c
            int r7 = r7 + r6
            r2.a(r7)
            byte[] r7 = r2.a
            int r8 = r2.f22600c
            r11.readFully(r7, r8, r6)     // Catch: java.io.EOFException -> L8a
            r7 = r3
            goto L8b
        L8a:
            r7 = r1
        L8b:
            if (r7 != 0) goto L8e
            return r1
        L8e:
            int r7 = r2.f22600c
            int r7 = r7 + r6
            r2.F(r7)
            int[] r6 = r5.f18896f
            int r7 = r0 + (-1)
            r6 = r6[r7]
            if (r6 == r4) goto L9d
            goto L9e
        L9d:
            r3 = r1
        L9e:
            r10.f18891e = r3
        La0:
            int r3 = r5.f18893c
            if (r0 != r3) goto La5
            r0 = -1
        La5:
            r10.f18889c = r0
            goto Lc
        La9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.f.a(y7.m):boolean");
    }
}
