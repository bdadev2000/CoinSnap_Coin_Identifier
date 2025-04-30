package com.bytedance.adsdk.lMd;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.core.app.NotificationCompat;
import com.bytedance.adsdk.lottie.LottieAnimationView;
import com.bytedance.adsdk.lottie.YW;
import com.bytedance.adsdk.lottie.jU;
import com.bytedance.adsdk.ugeno.component.lMd;
import com.bytedance.adsdk.ugeno.zp;
import com.bytedance.adsdk.ugeno.zp.KS;
import com.google.android.gms.common.internal.ImagesContract;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.HashMap;

/* loaded from: classes.dex */
public class zp extends lMd<LottieAnimationView> {
    private String DY;
    private boolean MBR;
    private String Rh;
    private float fgJ;
    private boolean gH;
    private float oB;
    private HashMap<String, Bitmap> qtv;
    private boolean rCC;
    protected ImageView.ScaleType zp;

    public zp(Context context) {
        super(context);
        this.Rh = "images";
        this.fgJ = 1.0f;
        this.zp = ImageView.ScaleType.FIT_CENTER;
        this.qtv = new HashMap<>();
    }

    private String COT(String str) {
        if (TextUtils.isEmpty(str) || !str.contains(ImagesContract.LOCAL)) {
            return "";
        }
        if (str.contains("shake_phone")) {
            return "lottie_json/shake_phone.json";
        }
        return str.contains("swipe_right") ? "lottie_json/swipe_right.json" : "";
    }

    private ImageView.ScaleType HWF(String str) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c9 = 0;
                    break;
                }
                break;
            case -1274298614:
                if (str.equals("fitEnd")) {
                    c9 = 1;
                    break;
                }
                break;
            case -522179887:
                if (str.equals("fitStart")) {
                    c9 = 2;
                    break;
                }
                break;
            case -340708175:
                if (str.equals("centerInside")) {
                    c9 = 3;
                    break;
                }
                break;
            case 97441490:
                if (str.equals("fitXY")) {
                    c9 = 4;
                    break;
                }
                break;
            case 520762310:
                if (str.equals("fitCenter")) {
                    c9 = 5;
                    break;
                }
                break;
            case 1161480325:
                if (str.equals("centerCrop")) {
                    c9 = 6;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                return ImageView.ScaleType.CENTER;
            case 1:
                return ImageView.ScaleType.FIT_END;
            case 2:
                return ImageView.ScaleType.FIT_START;
            case 3:
                return ImageView.ScaleType.CENTER_INSIDE;
            case 4:
            default:
                return scaleType;
            case 5:
                return ImageView.ScaleType.FIT_CENTER;
            case 6:
                return ImageView.ScaleType.CENTER_CROP;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    public void lMd() {
        super.lMd();
        ((LottieAnimationView) this.COT).setProgress(this.oB);
        if (this.fgJ <= 0.0f) {
            this.fgJ = 1.0f;
        }
        ((LottieAnimationView) this.COT).setSpeed(this.fgJ);
        if (this.DY.startsWith(ImagesContract.LOCAL)) {
            ((LottieAnimationView) this.COT).setAnimation(COT(this.DY));
            ((LottieAnimationView) this.COT).setImageAssetsFolder(this.Rh);
        } else {
            ((LottieAnimationView) this.COT).setAnimationFromUrl(this.DY);
            ((LottieAnimationView) this.COT).setImageAssetDelegate(new jU() { // from class: com.bytedance.adsdk.lMd.zp.1
                @Override // com.bytedance.adsdk.lottie.jU
                public Bitmap zp(final YW yw) {
                    final String str;
                    if (yw == null) {
                        return null;
                    }
                    String COT = yw.COT();
                    String jU = yw.jU();
                    if (!TextUtils.isEmpty(COT) && TextUtils.isEmpty(jU)) {
                        str = KS.zp(COT, ((lMd) zp.this).jU);
                    } else if (!TextUtils.isEmpty(jU) && TextUtils.isEmpty(COT)) {
                        str = KS.zp(jU, ((lMd) zp.this).jU);
                    } else if (!TextUtils.isEmpty(jU) && !TextUtils.isEmpty(COT)) {
                        str = KS.zp(COT, ((lMd) zp.this).jU) + KS.zp(jU, ((lMd) zp.this).jU);
                    } else {
                        str = null;
                    }
                    if (TextUtils.isEmpty(str)) {
                        return null;
                    }
                    Bitmap bitmap = (Bitmap) zp.this.qtv.get(str);
                    if (bitmap != null) {
                        return bitmap;
                    }
                    com.bytedance.adsdk.ugeno.KS.zp().lMd().zp(((lMd) zp.this).lMd, str, -1.0f, new zp.InterfaceC0070zp() { // from class: com.bytedance.adsdk.lMd.zp.1.1
                        @Override // com.bytedance.adsdk.ugeno.zp.InterfaceC0070zp
                        public void zp(Bitmap bitmap2) {
                            if (bitmap2 != null) {
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, yw.zp(), yw.lMd(), false);
                                zp.this.qtv.put(str, createScaledBitmap);
                                ((LottieAnimationView) ((lMd) zp.this).COT).zp(yw.KS(), createScaledBitmap);
                            }
                        }
                    });
                    return (Bitmap) zp.this.qtv.get(str);
                }
            });
        }
        ((LottieAnimationView) this.COT).setScaleType(this.zp);
        ((LottieAnimationView) this.COT).lMd(this.rCC);
        ((LottieAnimationView) this.COT).zp();
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public LottieAnimationView KS() {
        LottieAnimationView lottieAnimationView = new LottieAnimationView(this.lMd);
        lottieAnimationView.zp(this);
        return lottieAnimationView;
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    public void zp(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.zp(str, str2);
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1877911644:
                if (str.equals("scaleType")) {
                    c9 = 0;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals(NotificationCompat.CATEGORY_PROGRESS)) {
                    c9 = 1;
                    break;
                }
                break;
            case -878289888:
                if (str.equals("imagePath")) {
                    c9 = 2;
                    break;
                }
                break;
            case -291235277:
                if (str.equals("autoReverse")) {
                    c9 = 3;
                    break;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    c9 = 4;
                    break;
                }
                break;
            case 3327652:
                if (str.equals("loop")) {
                    c9 = 5;
                    break;
                }
                break;
            case 109641799:
                if (str.equals("speed")) {
                    c9 = 6;
                    break;
                }
                break;
            case 1438608771:
                if (str.equals("autoPlay")) {
                    c9 = 7;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                this.zp = HWF(str2);
                return;
            case 1:
                this.oB = com.bytedance.adsdk.ugeno.lMd.KS.zp(str2, 0.0f);
                return;
            case 2:
                this.Rh = str2;
                return;
            case 3:
                this.gH = com.bytedance.adsdk.ugeno.lMd.KS.zp(str2, false);
                return;
            case 4:
                this.DY = str2;
                return;
            case 5:
                this.rCC = com.bytedance.adsdk.ugeno.lMd.KS.zp(str2, false);
                return;
            case 6:
                this.fgJ = com.bytedance.adsdk.ugeno.lMd.KS.zp(str2, 1.0f);
                return;
            case 7:
                this.MBR = com.bytedance.adsdk.ugeno.lMd.KS.zp(str2, false);
                return;
            default:
                return;
        }
    }
}
