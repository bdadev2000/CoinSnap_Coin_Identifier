package v3;

import a4.l;
import a4.n;
import a5.g;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.e1;
import androidx.appcompat.widget.l2;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bytedance.sdk.component.Sg.YFl.Sg;
import com.bytedance.sdk.component.Sg.YFl.tN;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.mbridge.msdk.foundation.tools.SameMD5;
import e4.i;
import g0.s;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import k.o;
import k.q;
import k0.h;
import k4.d0;
import k4.g0;
import k4.h0;
import k4.i0;
import k4.m;
import k4.y;
import k4.z;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import m9.o0;
import n0.f;
import n0.r2;
import n4.j;
import n4.k;
import o0.u;
import vd.e;

/* loaded from: classes.dex */
public class c implements l2, e1, f, u1.c, u, n, i, k4.c, z, h0, k, a5.k, tN, MediaViewListener, PAGNativeAdInteractionListener, o0, n0.z {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26020b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f26021c;

    public /* synthetic */ c(Object obj, int i10) {
        this.f26020b = i10;
        this.f26021c = obj;
    }

    public static String A(String str, b bVar, boolean z10) {
        String str2 = bVar.f26019b;
        if (z10) {
            str2 = e.e(".temp", str2);
        }
        String replaceAll = str.replaceAll("\\W+", "");
        int length = 242 - str2.length();
        if (replaceAll.length() > length) {
            try {
                byte[] digest = MessageDigest.getInstance(SameMD5.TAG).digest(replaceAll.getBytes());
                StringBuilder sb2 = new StringBuilder();
                for (byte b3 : digest) {
                    sb2.append(String.format("%02x", Byte.valueOf(b3)));
                }
                replaceAll = sb2.toString();
            } catch (NoSuchAlgorithmException unused) {
                replaceAll = replaceAll.substring(0, length);
            }
        }
        return com.applovin.impl.mediation.ads.e.f("lottie_cache_", replaceAll, str2);
    }

    public static Object B(Object[] objArr, int i10, s sVar) {
        int i11;
        boolean z10;
        int i12;
        if ((i10 & 1) == 0) {
            i11 = 400;
        } else {
            i11 = 700;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object obj = null;
        int i13 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = Math.abs(sVar.m(obj2) - i11) * 2;
            if (sVar.d(obj2) == z10) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            int i14 = abs + i12;
            if (obj == null || i13 > i14) {
                obj = obj2;
                i13 = i14;
            }
        }
        return obj;
    }

    public h C(int i10, h[] hVarArr) {
        return (h) B(hVarArr, i10, new kc.c(this, 5));
    }

    public final File D() {
        File file = new File(((Context) ((androidx.core.app.h) this.f26021c).f1189c).getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File E(String str, InputStream inputStream, b bVar) {
        File file = new File(D(), A(str, bVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        return file;
                    }
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.tN
    public final void YFl(Sg sg2, IOException iOException) {
        ((h5.a) this.f26021c).f18774g = false;
        ((h5.a) this.f26021c).a = -1L;
    }

    @Override // k4.c
    public final Class a() {
        return ByteBuffer.class;
    }

    @Override // a4.n
    public final void b(l lVar, String str) {
        Log.d("PurchaseEG", "onConsumeResponse: " + lVar.f152b);
    }

    @Override // k4.z
    public final y c(d0 d0Var) {
        switch (this.f26020b) {
            case 19:
                return new m((Resources) this.f26021c, g0.a);
            default:
                return new i0(this);
        }
    }

    @Override // n4.k
    public final int d() {
        return (r() << 8) | r();
    }

    @Override // u1.c
    public final void e() {
        mi.a.f22244c.e();
    }

    @Override // u1.c
    public final void f(int i10, Object obj) {
        mi.a.f22244c.f(i10, obj);
        ((ProfileInstallReceiver) this.f26021c).setResultCode(i10);
    }

    @Override // a5.k
    public final void g(a5.m mVar) {
        boolean z10;
        ((g) this.f26021c).f217c.addAndGet(mVar.f217c.get());
        ((g) this.f26021c).f218d.addAndGet(mVar.f218d.get());
        synchronized (mVar.f211p) {
            mVar.f211p.notifyAll();
        }
        if (mVar.f224k.get() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            g gVar = (g) this.f26021c;
            gVar.f194p.a(gVar.a(), null);
        }
    }

    @Override // n0.f
    public final int getSource() {
        return com.google.android.gms.internal.ads.b.C((ContentInfo) this.f26021c);
    }

    @Override // androidx.appcompat.widget.l2
    public final void h(o oVar, MenuItem menuItem) {
        ((k.i) this.f26021c).f20092i.removeCallbacksAndMessages(oVar);
    }

    public void i(int i10) {
    }

    @Override // n4.k
    public final int j(int i10, byte[] bArr) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10 && (i12 = ((InputStream) this.f26021c).read(bArr, i11, i10 - i11)) != -1) {
            i11 += i12;
        }
        if (i11 == 0 && i12 == -1) {
            throw new j();
        }
        return i11;
    }

    @Override // k4.h0
    public final com.bumptech.glide.load.data.e k(Uri uri) {
        return new com.bumptech.glide.load.data.a((ContentResolver) this.f26021c, uri, 0);
    }

    @Override // k4.c
    public final Object l(byte[] bArr) {
        return ByteBuffer.wrap(bArr);
    }

    @Override // n0.f
    public final ContentInfo m() {
        return (ContentInfo) this.f26021c;
    }

    @Override // m9.o0
    public final void maybeThrowError() {
        y8.h hVar = (y8.h) this.f26021c;
        hVar.B.maybeThrowError();
        x3.a aVar = hVar.D;
        if (aVar == null) {
        } else {
            throw aVar;
        }
    }

    @Override // e4.i
    public final ImageHeaderParser$ImageType n(e4.f fVar) {
        Object obj = this.f26021c;
        try {
            return fVar.b((ByteBuffer) obj);
        } finally {
            w4.b.c((ByteBuffer) obj);
        }
    }

    @Override // n0.f
    public final ClipData o() {
        return com.google.android.gms.internal.ads.b.g((ContentInfo) this.f26021c);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdClicked() {
        Object obj = this.f26021c;
        if (((z6.k) obj).f28556i != null) {
            ((z6.k) obj).f28556i.reportAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdDismissed() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdShowed() {
        Object obj = this.f26021c;
        if (((z6.k) obj).f28556i != null) {
            ((z6.k) obj).f28556i.reportAdImpression();
        }
    }

    @Override // com.facebook.ads.MediaViewListener
    public final void onComplete(MediaView mediaView) {
        Object obj = this.f26021c;
        if (((t6.e) obj).f25284f != null) {
            ((t6.e) obj).f25284f.onVideoComplete();
        }
    }

    @Override // com.facebook.ads.MediaViewListener
    public final void onEnterFullscreen(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public final void onExitFullscreen(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public final void onFullscreenBackground(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public final void onFullscreenForeground(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public final void onPause(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public final void onPlay(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public final void onVolumeChange(MediaView mediaView, float f10) {
    }

    @Override // o0.u
    public final boolean p(View view) {
        j2.m mVar = (j2.m) this.f26021c;
        int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
        ViewPager2 viewPager2 = mVar.f19736h;
        if (viewPager2.f2164t) {
            viewPager2.c(currentItem);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.l2
    public final void q(o oVar, q qVar) {
        k.i iVar = (k.i) this.f26021c;
        k.h hVar = null;
        iVar.f20092i.removeCallbacksAndMessages(null);
        int size = iVar.f20094k.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (oVar == ((k.h) iVar.f20094k.get(i10)).f20066b) {
                    break;
                } else {
                    i10++;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < iVar.f20094k.size()) {
            hVar = (k.h) iVar.f20094k.get(i11);
        }
        iVar.f20092i.postAtTime(new k.g(0, this, hVar, qVar, oVar), oVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // n4.k
    public final short r() {
        int read = ((InputStream) this.f26021c).read();
        if (read != -1) {
            return (short) read;
        }
        throw new j();
    }

    @Override // n0.f
    public final int s() {
        return com.google.android.gms.internal.ads.b.f((ContentInfo) this.f26021c);
    }

    @Override // n4.k
    public final long skip(long j3) {
        if (j3 < 0) {
            return 0L;
        }
        long j10 = j3;
        while (j10 > 0) {
            Object obj = this.f26021c;
            long skip = ((InputStream) obj).skip(j10);
            if (skip > 0) {
                j10 -= skip;
            } else {
                if (((InputStream) obj).read() == -1) {
                    break;
                }
                j10--;
            }
        }
        return j3 - j10;
    }

    @Override // n0.z
    public final r2 t(View view, r2 r2Var) {
        v9.g gVar = (v9.g) this.f26021c;
        v9.f fVar = gVar.f26365o;
        if (fVar != null) {
            gVar.f26358h.Y.remove(fVar);
        }
        v9.f fVar2 = new v9.f(gVar.f26361k, r2Var);
        gVar.f26365o = fVar2;
        fVar2.e(gVar.getWindow());
        BottomSheetBehavior bottomSheetBehavior = gVar.f26358h;
        v9.f fVar3 = gVar.f26365o;
        ArrayList arrayList = bottomSheetBehavior.Y;
        if (!arrayList.contains(fVar3)) {
            arrayList.add(fVar3);
        }
        return r2Var;
    }

    public final String toString() {
        switch (this.f26020b) {
            case 5:
                return "ContentInfoCompat{" + ((ContentInfo) this.f26021c) + "}";
            default:
                return super.toString();
        }
    }

    public void u(int i10) {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Typeface v(android.content.Context r9, f0.f r10, android.content.res.Resources r11, int r12) {
        /*
            r8 = this;
            f.a r0 = new f.a
            r1 = 4
            r0.<init>(r8, r1)
            f0.g[] r1 = r10.a
            java.lang.Object r0 = B(r1, r12, r0)
            f0.g r0 = (f0.g) r0
            if (r0 != 0) goto L12
            r9 = 0
            return r9
        L12:
            int r6 = r0.f17522f
            java.lang.String r7 = r0.a
            v3.c r0 = g0.l.a
            r1 = r9
            r2 = r11
            r3 = r6
            r4 = r7
            r5 = r12
            android.graphics.Typeface r9 = r0.y(r1, r2, r3, r4, r5)
            if (r9 == 0) goto L2d
            r0 = 0
            java.lang.String r11 = g0.l.b(r11, r6, r7, r0, r12)
            r.f r12 = g0.l.f17916b
            r12.put(r11, r9)
        L2d:
            java.lang.String r11 = "Could not retrieve font from family."
            java.lang.String r12 = "TypefaceCompatBaseImpl"
            r0 = 0
            if (r9 != 0) goto L37
        L35:
            r11 = r0
            goto L58
        L37:
            java.lang.Class<android.graphics.Typeface> r2 = android.graphics.Typeface.class
            java.lang.String r3 = "native_instance"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.IllegalAccessException -> L4e java.lang.NoSuchFieldException -> L53
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.IllegalAccessException -> L4e java.lang.NoSuchFieldException -> L53
            java.lang.Object r2 = r2.get(r9)     // Catch: java.lang.IllegalAccessException -> L4e java.lang.NoSuchFieldException -> L53
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.IllegalAccessException -> L4e java.lang.NoSuchFieldException -> L53
            long r11 = r2.longValue()     // Catch: java.lang.IllegalAccessException -> L4e java.lang.NoSuchFieldException -> L53
            goto L58
        L4e:
            r2 = move-exception
            android.util.Log.e(r12, r11, r2)
            goto L35
        L53:
            r2 = move-exception
            android.util.Log.e(r12, r11, r2)
            goto L35
        L58:
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 == 0) goto L67
            java.lang.Object r0 = r8.f26021c
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r0.put(r11, r10)
        L67:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.c.v(android.content.Context, f0.f, android.content.res.Resources, int):android.graphics.Typeface");
    }

    public Typeface w(Context context, h[] hVarArr, int i10) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (hVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(C(i10, hVarArr).a);
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Typeface x10 = x(context, inputStream);
            com.bumptech.glide.c.m(inputStream);
            return x10;
        } catch (IOException unused2) {
            com.bumptech.glide.c.m(inputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            inputStream2 = inputStream;
            com.bumptech.glide.c.m(inputStream2);
            throw th;
        }
    }

    public Typeface x(Context context, InputStream inputStream) {
        File D = com.bumptech.glide.c.D(context);
        if (D == null) {
            return null;
        }
        try {
            if (!com.bumptech.glide.c.o(inputStream, D)) {
                return null;
            }
            return Typeface.createFromFile(D.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            D.delete();
        }
    }

    public Typeface y(Context context, Resources resources, int i10, String str, int i11) {
        File D = com.bumptech.glide.c.D(context);
        if (D == null) {
            return null;
        }
        try {
            if (!com.bumptech.glide.c.n(D, resources, i10)) {
                return null;
            }
            return Typeface.createFromFile(D.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            D.delete();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0877, code lost:
    
        if (r0.o() == r1.getLeastSignificantBits()) goto L489;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:103:0x054c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x08f7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0ad3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0a48  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0a4a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x08f9  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x08aa  */
    /* JADX WARN: Type inference failed for: r0v112 */
    /* JADX WARN: Type inference failed for: r0v113, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r2v39, types: [int] */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r6v84 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(int r37) {
        /*
            Method dump skipped, instructions count: 3384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.c.z(int):void");
    }

    public c(int i10) {
        this.f26020b = 18;
        this.f26021c = new i4.e(this);
    }

    public c(boolean z10) {
        this.f26020b = 7;
        this.f26021c = new AtomicBoolean(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:35:0x0073, B:36:0x007f, B:38:0x0088, B:40:0x0093, B:44:0x00a8, B:46:0x00c7, B:47:0x00cd, B:61:0x00f2, B:62:0x00f3, B:66:0x00f7, B:49:0x00ce, B:53:0x00ec), top: B:34:0x0073, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f4 A[SYNTHETIC] */
    @Override // com.bytedance.sdk.component.Sg.YFl.tN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void YFl(com.bytedance.sdk.component.Sg.YFl.Sg r17, com.bytedance.sdk.component.Sg.YFl.EH r18) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.c.YFl(com.bytedance.sdk.component.Sg.YFl.Sg, com.bytedance.sdk.component.Sg.YFl.EH):void");
    }

    public c() {
        this.f26020b = 4;
        this.f26021c = new ConcurrentHashMap();
    }

    public c(ContentInfo contentInfo) {
        this.f26020b = 5;
        contentInfo.getClass();
        this.f26021c = com.google.android.gms.internal.ads.b.m(contentInfo);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(x7.i iVar) {
        this(iVar, 26);
        this.f26020b = 26;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e8.d dVar) {
        this(dVar, 27);
        this.f26020b = 27;
    }
}
