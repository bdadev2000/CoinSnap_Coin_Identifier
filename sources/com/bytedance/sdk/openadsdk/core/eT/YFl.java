package com.bytedance.sdk.openadsdk.core.eT;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.bytedance.adsdk.ugeno.YFl;
import com.bytedance.sdk.component.qsH.qsH;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.component.utils.vc;
import com.bytedance.sdk.component.wN.eT;
import com.bytedance.sdk.component.wN.nc;
import com.bytedance.sdk.component.wN.rkt;
import com.bytedance.sdk.openadsdk.NjR.AlY;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.widget.wN;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.bytedance.sdk.openadsdk.utils.pDU;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Map;
import n0.w0;

/* loaded from: classes.dex */
public class YFl implements com.bytedance.adsdk.ugeno.YFl {

    /* loaded from: classes.dex */
    public static class Sg implements rkt {
        private WeakReference<wN> YFl;

        public Sg(wN wNVar) {
            this.YFl = new WeakReference<>(wNVar);
        }

        @Override // com.bytedance.sdk.component.wN.rkt
        public void YFl(int i10, String str, Throwable th2) {
        }

        @Override // com.bytedance.sdk.component.wN.rkt
        public void YFl(eT eTVar) {
            try {
                wN wNVar = this.YFl.get();
                if (wNVar == null) {
                    return;
                }
                Object Sg = eTVar.Sg();
                if (Sg instanceof byte[]) {
                    if (eTVar.wN()) {
                        wNVar.YFl((byte[]) Sg, false);
                        wNVar.setRepeatConfig(true);
                        wNVar.Sg();
                        return;
                    }
                    wNVar.setImageDrawable(pDU.YFl((byte[]) Sg, 0));
                    return;
                }
                if (Sg instanceof Bitmap) {
                    wNVar.setImageBitmap((Bitmap) Sg);
                }
            } catch (Throwable th2) {
                YFl(1002, "", th2);
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.eT.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0126YFl {
        void YFl(Drawable drawable);
    }

    /* loaded from: classes.dex */
    public static class tN implements rkt {
        private final int AlY;
        private final YFl Sg;
        private final WeakReference<ImageView> YFl;
        private final int tN;

        public tN(ImageView imageView, YFl yFl, int i10, int i11) {
            this.YFl = new WeakReference<>(imageView);
            this.Sg = yFl;
            this.tN = i10;
            this.AlY = i11;
        }

        @Override // com.bytedance.sdk.component.wN.rkt
        public void YFl(int i10, String str, Throwable th2) {
        }

        @Override // com.bytedance.sdk.component.wN.rkt
        public void YFl(eT eTVar) {
            try {
                final ImageView imageView = this.YFl.get();
                if (imageView == null) {
                    return;
                }
                final Object Sg = eTVar.Sg();
                if (Sg instanceof byte[]) {
                    if (eTVar.wN()) {
                        if (Build.VERSION.SDK_INT > 30) {
                            this.Sg.YFl(imageView, (byte[]) Sg, this.tN, this.AlY);
                            return;
                        } else {
                            this.Sg.YFl((byte[]) Sg, imageView);
                            return;
                        }
                    }
                    if (this.Sg.YFl((byte[]) Sg)) {
                        this.Sg.YFl(imageView, (byte[]) Sg, this.tN, this.AlY);
                        return;
                    }
                    final Bitmap YFl = new com.bytedance.sdk.component.wN.tN.Sg.YFl(this.tN, this.AlY, imageView.getScaleType(), Bitmap.Config.RGB_565, this.tN, this.AlY).YFl((byte[]) Sg);
                    if (YFl != null) {
                        mn.YFl((Runnable) new qsH("load_static_img") { // from class: com.bytedance.sdk.openadsdk.core.eT.YFl.tN.1
                            @Override // java.lang.Runnable
                            public void run() {
                                imageView.setImageBitmap(YFl);
                            }
                        });
                        return;
                    }
                    return;
                }
                if (Sg instanceof Bitmap) {
                    mn.YFl((Runnable) new qsH("ug_load_bitmap") { // from class: com.bytedance.sdk.openadsdk.core.eT.YFl.tN.2
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap((Bitmap) Sg);
                        }
                    });
                }
            } catch (Throwable th2) {
                YoT.YFl("ImageLoaderProvider", th2.getMessage());
            }
        }
    }

    private void Sg(final ImageView imageView, byte[] bArr, int i10, int i11) {
        final Bitmap YFl = new com.bytedance.sdk.component.wN.tN.Sg.YFl(i10, i11, imageView.getScaleType(), Bitmap.Config.ARGB_4444, i10, i11).YFl(bArr);
        if (YFl != null) {
            mn.YFl((Runnable) new qsH("loadStaticImage") { // from class: com.bytedance.sdk.openadsdk.core.eT.YFl.2
                @Override // java.lang.Runnable
                public void run() {
                    imageView.setImageBitmap(YFl);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable Sg(byte[] bArr) {
        FileOutputStream fileOutputStream;
        File YFl;
        ImageDecoder.Source createSource;
        Drawable decodeDrawable;
        try {
            boolean tN2 = com.bytedance.sdk.openadsdk.multipro.Sg.tN();
            YFl = vc.YFl(lG.YFl(), tN2, tN2 ? "UGEN_GIF_AD_CACHE/" : "/UGEN_GIF_CACHE/", "TT_UGEN_GIF_FILE");
            fileOutputStream = new FileOutputStream(YFl);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        try {
            fileOutputStream.write(bArr, 0, bArr.length);
            if (Build.VERSION.SDK_INT >= 28) {
                createSource = ImageDecoder.createSource(YFl);
                decodeDrawable = ImageDecoder.decodeDrawable(createSource);
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                return decodeDrawable;
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(lG.YFl().getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            try {
                fileOutputStream.close();
            } catch (Throwable unused2) {
            }
            return bitmapDrawable;
        } catch (Throwable th3) {
            th = th3;
            try {
                YoT.YFl("ImageLoaderProvider", "GifView  getSourceByFile fail : ", th);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused3) {
                    }
                }
                return null;
            } catch (Throwable th4) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused4) {
                    }
                }
                throw th4;
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.YFl
    public void YFl(com.bytedance.adsdk.ugeno.core.qsH qsh, String str, ImageView imageView) {
        if (imageView instanceof wN) {
            wN wNVar = (wN) imageView;
            wNVar.setAdjustViewBounds(true);
            wNVar.setBackgroundColor(0);
            AlY.YFl(str).tN(3).YFl(Bitmap.Config.RGB_565).YFl(new Sg(wNVar));
            return;
        }
        nc YFl = AlY.YFl(str);
        YFl(qsh, YFl, str);
        YFl.YFl(imageView);
    }

    @Override // com.bytedance.adsdk.ugeno.YFl
    public void YFl(com.bytedance.adsdk.ugeno.core.qsH qsh, String str, ImageView imageView, int i10, int i11) {
        nc tN2 = AlY.YFl(str).tN(3);
        YFl(qsh, tN2, str);
        tN2.YFl(new tN(imageView, this, i10, i11), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(final ImageView imageView, byte[] bArr, int i10, int i11) {
        ImageDecoder.Source createSource;
        final Drawable decodeDrawable;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT >= 28) {
            createSource = ImageDecoder.createSource(wrap);
            try {
                decodeDrawable = ImageDecoder.decodeDrawable(createSource);
                if (decodeDrawable != null) {
                    mn.YFl((Runnable) new qsH("loadAnimatedDrawable") { // from class: com.bytedance.sdk.openadsdk.core.eT.YFl.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageDrawable(decodeDrawable);
                        }
                    });
                    return;
                }
                return;
            } catch (IOException e2) {
                YoT.YFl("ImageLoaderProvider", e2.getMessage());
                return;
            }
        }
        Sg(imageView, bArr, i10, i11);
    }

    public void Sg(com.bytedance.adsdk.ugeno.core.qsH qsh, String str, final YFl.InterfaceC0065YFl interfaceC0065YFl) {
        nc tN2 = AlY.YFl(str).tN(1);
        YFl(qsh, tN2, str);
        tN2.YFl(new rkt() { // from class: com.bytedance.sdk.openadsdk.core.eT.YFl.5
            @Override // com.bytedance.sdk.component.wN.rkt
            public void YFl(eT eTVar) {
                if (eTVar == null) {
                    interfaceC0065YFl.YFl(null);
                    return;
                }
                if (interfaceC0065YFl != null) {
                    Object Sg2 = eTVar.Sg();
                    if (Sg2 instanceof Bitmap) {
                        interfaceC0065YFl.YFl((Bitmap) Sg2);
                        return;
                    }
                    if (eTVar.Sg() instanceof byte[]) {
                        try {
                            interfaceC0065YFl.YFl(BitmapFactory.decodeByteArray((byte[]) eTVar.Sg(), 0, ((byte[]) eTVar.Sg()).length));
                            return;
                        } catch (Throwable unused) {
                        }
                    }
                    interfaceC0065YFl.YFl(null);
                }
            }

            @Override // com.bytedance.sdk.component.wN.rkt
            public void YFl(int i10, String str2, Throwable th2) {
                YFl.InterfaceC0065YFl interfaceC0065YFl2 = interfaceC0065YFl;
                if (interfaceC0065YFl2 != null) {
                    interfaceC0065YFl2.YFl(null);
                }
            }
        }, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(byte[] bArr, final ImageView imageView) {
        try {
            YoT.YFl("ImageLoaderProvider", "load animation image");
            YFl(bArr, new InterfaceC0126YFl() { // from class: com.bytedance.sdk.openadsdk.core.eT.YFl.3
                @Override // com.bytedance.sdk.openadsdk.core.eT.YFl.InterfaceC0126YFl
                public void YFl(final Drawable drawable) {
                    mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.eT.YFl.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28 && w0.x(drawable)) {
                                w0.f(drawable).start();
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            });
        } catch (Exception e2) {
            YoT.YFl("ImageLoaderProvider", e2.getMessage());
        }
    }

    private void YFl(final byte[] bArr, final InterfaceC0126YFl interfaceC0126YFl) {
        mn.Sg(new qsH("pag_animation_drawable") { // from class: com.bytedance.sdk.openadsdk.core.eT.YFl.4
            @Override // java.lang.Runnable
            public void run() {
                Drawable Sg2 = YFl.this.Sg(bArr);
                InterfaceC0126YFl interfaceC0126YFl2 = interfaceC0126YFl;
                if (interfaceC0126YFl2 != null) {
                    interfaceC0126YFl2.YFl(Sg2);
                }
            }
        });
    }

    public boolean YFl(byte[] bArr) {
        return com.bytedance.sdk.component.adexpress.AlY.vc.YFl(bArr, 0);
    }

    @Override // com.bytedance.adsdk.ugeno.YFl
    public void YFl(com.bytedance.adsdk.ugeno.core.qsH qsh, String str, YFl.InterfaceC0065YFl interfaceC0065YFl) {
        Sg(qsh, str, interfaceC0065YFl);
    }

    private void YFl(com.bytedance.adsdk.ugeno.core.qsH qsh, @NonNull nc ncVar, String str) {
        Map<String, Object> Sg2;
        if (qsh == null || (Sg2 = qsh.Sg()) == null) {
            return;
        }
        Object obj = Sg2.get("image_info");
        if (obj instanceof Map) {
            ncVar.YFl((String) ((Map) obj).get(str));
        }
        String str2 = (String) Sg2.get("cache_dir");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        ncVar.Sg(str2);
    }
}
