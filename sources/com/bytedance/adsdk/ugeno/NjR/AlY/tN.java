package com.bytedance.adsdk.ugeno.NjR.AlY;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.AlY;
import com.bytedance.adsdk.ugeno.DSW.qsH;
import com.bytedance.adsdk.ugeno.YFl;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import n0.w0;

/* loaded from: classes.dex */
public class tN extends com.bytedance.adsdk.ugeno.Sg.Sg<YFl> {
    private float ECi;
    private int Gmi;
    protected ImageView.ScaleType Gnp;
    protected String YFl;
    private float dU;

    /* renamed from: ni, reason: collision with root package name */
    protected boolean f10239ni;

    public tN(Context context) {
        super(context);
        this.Gnp = ImageView.ScaleType.FIT_XY;
        this.Gmi = -1;
        this.dU = -1.0f;
        this.ECi = -1.0f;
    }

    private void ZU() {
        if (this.dU > 0.0f) {
            AlY.YFl().Sg().YFl(this.NjR, this.YFl, new YFl.InterfaceC0065YFl() { // from class: com.bytedance.adsdk.ugeno.NjR.AlY.tN.1
                @Override // com.bytedance.adsdk.ugeno.YFl.InterfaceC0065YFl
                public void YFl(Bitmap bitmap) {
                    int i10;
                    if (bitmap == null) {
                        return;
                    }
                    final Bitmap YFl = qsH.YFl(((com.bytedance.adsdk.ugeno.Sg.Sg) tN.this).Sg, bitmap, (int) tN.this.dU);
                    if (YFl != null) {
                        qsH.YFl(new Runnable() { // from class: com.bytedance.adsdk.ugeno.NjR.AlY.tN.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((YFl) ((com.bytedance.adsdk.ugeno.Sg.Sg) tN.this).wN).setImageBitmap(YFl);
                            }
                        });
                    }
                    tN tNVar = tN.this;
                    if (tNVar.f10239ni || tNVar.ECi > 0.0f) {
                        Context context = ((com.bytedance.adsdk.ugeno.Sg.Sg) tN.this).Sg;
                        if (tN.this.ECi > 0.0f) {
                            i10 = (int) tN.this.ECi;
                        } else {
                            i10 = 10;
                        }
                        Bitmap YFl2 = qsH.YFl(context, bitmap, i10);
                        if (YFl2 != null) {
                            final BitmapDrawable bitmapDrawable = new BitmapDrawable(((com.bytedance.adsdk.ugeno.Sg.Sg) tN.this).Sg.getResources(), YFl2);
                            qsH.YFl(new Runnable() { // from class: com.bytedance.adsdk.ugeno.NjR.AlY.tN.1.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    ((YFl) ((com.bytedance.adsdk.ugeno.Sg.Sg) tN.this).wN).setBackground(bitmapDrawable);
                                }
                            });
                        }
                    }
                }
            });
            return;
        }
        com.bytedance.adsdk.ugeno.YFl Sg = AlY.YFl().Sg();
        com.bytedance.adsdk.ugeno.core.qsH qsh = this.NjR;
        String str = this.YFl;
        T t5 = this.wN;
        Sg.YFl(qsh, str, (ImageView) t5, ((YFl) t5).getWidth(), ((YFl) this.wN).getHeight());
        if (this.f10239ni || this.ECi > 0.0f) {
            AlY.YFl().Sg().YFl(this.NjR, this.YFl, new YFl.InterfaceC0065YFl() { // from class: com.bytedance.adsdk.ugeno.NjR.AlY.tN.2
                @Override // com.bytedance.adsdk.ugeno.YFl.InterfaceC0065YFl
                public void YFl(Bitmap bitmap) {
                    int i10;
                    if (bitmap != null) {
                        Context context = ((com.bytedance.adsdk.ugeno.Sg.Sg) tN.this).Sg;
                        if (tN.this.ECi > 0.0f) {
                            i10 = (int) tN.this.ECi;
                        } else {
                            i10 = 10;
                        }
                        final Bitmap YFl = qsH.YFl(context, bitmap, i10);
                        qsH.YFl(new Runnable() { // from class: com.bytedance.adsdk.ugeno.NjR.AlY.tN.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (YFl != null) {
                                    ((YFl) ((com.bytedance.adsdk.ugeno.Sg.Sg) tN.this).wN).setBackground(new BitmapDrawable(((com.bytedance.adsdk.ugeno.Sg.Sg) tN.this).Sg.getResources(), YFl));
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    private void tN() {
        if (TextUtils.isEmpty(this.YFl)) {
            return;
        }
        ((YFl) this.wN).setImageDrawable(null);
        if (this.YFl.startsWith("local://")) {
            try {
                ((YFl) this.wN).setImageResource(com.bytedance.adsdk.ugeno.DSW.AlY.YFl(this.Sg, this.YFl.replace("local://", "")));
            } catch (Throwable unused) {
            }
        } else {
            if (this.YFl.startsWith("@")) {
                try {
                    ((YFl) this.wN).setImageResource(Integer.parseInt(this.YFl.substring(1)));
                    return;
                } catch (Exception unused2) {
                    return;
                }
            }
            ZU();
        }
    }

    private ImageView.ScaleType vc(String str) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1274298614:
                if (str.equals("fitEnd")) {
                    c10 = 1;
                    break;
                }
                break;
            case -522179887:
                if (str.equals("fitStart")) {
                    c10 = 2;
                    break;
                }
                break;
            case -340708175:
                if (str.equals("centerInside")) {
                    c10 = 3;
                    break;
                }
                break;
            case 101393:
                if (str.equals("fit")) {
                    c10 = 4;
                    break;
                }
                break;
            case 3062416:
                if (str.equals("crop")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3143043:
                if (str.equals("fill")) {
                    c10 = 6;
                    break;
                }
                break;
            case 97441490:
                if (str.equals("fitXY")) {
                    c10 = 7;
                    break;
                }
                break;
            case 520762310:
                if (str.equals("fitCenter")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1161480325:
                if (str.equals("centerCrop")) {
                    c10 = '\t';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return ImageView.ScaleType.CENTER;
            case 1:
                return ImageView.ScaleType.FIT_END;
            case 2:
                return ImageView.ScaleType.FIT_START;
            case 3:
                return ImageView.ScaleType.CENTER_INSIDE;
            case 4:
            case '\b':
                return ImageView.ScaleType.FIT_CENTER;
            case 5:
            case '\t':
                return ImageView.ScaleType.CENTER_CROP;
            case 6:
            case 7:
                return ImageView.ScaleType.FIT_XY;
            default:
                return scaleType;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg, com.bytedance.adsdk.ugeno.tN
    public void DSW() {
        super.DSW();
        ((YFl) this.wN).post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.NjR.AlY.tN.3
            @Override // java.lang.Runnable
            public void run() {
                Drawable drawable = ((YFl) ((com.bytedance.adsdk.ugeno.Sg.Sg) tN.this).wN).getDrawable();
                if (Build.VERSION.SDK_INT >= 28 && w0.x(drawable)) {
                    w0.f(drawable).start();
                }
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    public void Sg() {
        super.Sg();
        tN();
        ((YFl) this.wN).setScaleType(this.Gnp);
        ((YFl) this.wN).setBorderColor(this.VB);
        ((YFl) this.wN).setCornerRadius(this.ZU);
        ((YFl) this.wN).setBorderWidth(this.Cqy);
        int i10 = this.Gmi;
        if (i10 != -1) {
            ((YFl) this.wN).setColorFilter(i10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public YFl AlY() {
        YFl yFl = new YFl(this.Sg);
        yFl.YFl(this);
        return yFl;
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg, com.bytedance.adsdk.ugeno.tN
    public void qsH() {
        super.qsH();
        Drawable drawable = ((YFl) this.wN).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !w0.x(drawable)) {
            return;
        }
        w0.f(drawable).stop();
    }

    public void wN(String str) {
        this.YFl = str;
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    public void YFl(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.YFl(str, str2);
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1878130163:
                if (str.equals("scaleMode")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1877911644:
                if (str.equals("scaleType")) {
                    c10 = 1;
                    break;
                }
                break;
            case -878696350:
                if (str.equals("imageBlur")) {
                    c10 = 2;
                    break;
                }
                break;
            case -372324943:
                if (str.equals("isBgGaussianBlur")) {
                    c10 = 3;
                    break;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1327599912:
                if (str.equals("tintColor")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1675225991:
                if (str.equals("imageBgBlur")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                this.Gnp = vc(str2);
                return;
            case 2:
                this.dU = com.bytedance.adsdk.ugeno.DSW.tN.YFl(str2, -1.0f);
                return;
            case 3:
                this.f10239ni = com.bytedance.adsdk.ugeno.DSW.tN.YFl(str2, false);
                return;
            case 4:
                this.YFl = str2;
                return;
            case 5:
                this.Gmi = com.bytedance.adsdk.ugeno.DSW.YFl.YFl(str2);
                return;
            case 6:
                this.ECi = com.bytedance.adsdk.ugeno.DSW.tN.YFl(str2, -1.0f);
                return;
            default:
                return;
        }
    }
}
