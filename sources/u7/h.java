package u7;

import android.content.Context;
import android.content.IntentFilter;
import com.google.common.collect.e2;
import com.google.common.collect.z1;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final h f25558c = new h(new int[]{2}, 10);

    /* renamed from: d, reason: collision with root package name */
    public static final z1 f25559d = com.google.common.collect.r0.q(2, 5, 6);

    /* renamed from: e, reason: collision with root package name */
    public static final e2 f25560e;
    public final int[] a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25561b;

    static {
        m9.s sVar = new m9.s(4);
        sVar.c(5, 6);
        sVar.c(17, 6);
        sVar.c(7, 6);
        sVar.c(30, 10);
        sVar.c(18, 6);
        sVar.c(6, 8);
        sVar.c(8, 8);
        sVar.c(14, 8);
        f25560e = sVar.a();
    }

    public h(int[] iArr, int i10) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.a = new int[0];
        }
        this.f25561b = i10;
    }

    public static h a(Context context) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (r8 != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static u7.h b(android.content.Context r8, android.content.Intent r9) {
        /*
            int r0 = n9.h0.a
            u7.h r1 = u7.h.f25558c
            r2 = 23
            if (r0 < r2) goto Lf
            boolean r3 = u7.f.b(r8)
            if (r3 == 0) goto Lf
            return r1
        Lf:
            com.google.common.collect.z0 r3 = new com.google.common.collect.z0
            r3.<init>()
            r4 = 17
            r5 = 1
            r6 = 0
            if (r0 < r4) goto L2e
            java.lang.String r4 = n9.h0.f22545c
            java.lang.String r7 = "Amazon"
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L2c
            java.lang.String r7 = "Xiaomi"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L2e
        L2c:
            r4 = r5
            goto L2f
        L2e:
            r4 = r6
        L2f:
            if (r4 == 0) goto L45
            android.content.ContentResolver r4 = r8.getContentResolver()
            java.lang.String r7 = "external_surround_sound_enabled"
            int r4 = android.provider.Settings.Global.getInt(r4, r7, r6)
            if (r4 != r5) goto L45
            com.google.common.collect.z1 r4 = u7.h.f25559d
            r4.getClass()
            r3.w(r4)
        L45:
            r4 = 29
            r7 = 10
            if (r0 < r4) goto L7c
            boolean r4 = n9.h0.G(r8)
            if (r4 != 0) goto L64
            if (r0 < r2) goto L61
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            java.lang.String r0 = "android.hardware.type.automotive"
            boolean r8 = r8.hasSystemFeature(r0)
            if (r8 == 0) goto L61
            r8 = r5
            goto L62
        L61:
            r8 = r6
        L62:
            if (r8 == 0) goto L7c
        L64:
            com.google.common.collect.r0 r8 = u7.g.a()
            r8.getClass()
            r3.w(r8)
            u7.h r8 = new u7.h
            com.google.common.collect.b1 r9 = r3.A()
            int[] r9 = c6.c.B(r9)
            r8.<init>(r9, r7)
            return r8
        L7c:
            if (r9 == 0) goto Lb9
            java.lang.String r8 = "android.media.extra.AUDIO_PLUG_STATE"
            int r8 = r9.getIntExtra(r8, r6)
            if (r8 != r5) goto Lb9
            java.lang.String r8 = "android.media.extra.ENCODINGS"
            int[] r8 = r9.getIntArrayExtra(r8)
            if (r8 == 0) goto La5
            int r0 = r8.length
            if (r0 != 0) goto L96
            java.util.List r8 = java.util.Collections.emptyList()
            goto L9d
        L96:
            ta.a r0 = new ta.a
            int r1 = r8.length
            r0.<init>(r8, r6, r1)
            r8 = r0
        L9d:
            r8.getClass()
            java.util.List r8 = (java.util.List) r8
            r3.w(r8)
        La5:
            u7.h r8 = new u7.h
            com.google.common.collect.b1 r0 = r3.A()
            int[] r0 = c6.c.B(r0)
            java.lang.String r1 = "android.media.extra.MAX_CHANNEL_COUNT"
            int r9 = r9.getIntExtra(r1, r7)
            r8.<init>(r0, r9)
            return r8
        Lb9:
            com.google.common.collect.b1 r8 = r3.A()
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto Lcd
            u7.h r9 = new u7.h
            int[] r8 = c6.c.B(r8)
            r9.<init>(r8, r7)
            return r9
        Lcd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.h.b(android.content.Context, android.content.Intent):u7.h");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b1, code lost:
    
        if (r10 != 5) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x003d, code lost:
    
        if (r10 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x004e, code lost:
    
        r0 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x004c, code lost:
    
        if (r10 == false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair c(s7.r0 r12) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.h.c(s7.r0):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (Arrays.equals(this.a, hVar.a) && this.f25561b == hVar.f25561b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + this.f25561b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f25561b + ", supportedEncodings=" + Arrays.toString(this.a) + "]";
    }
}
