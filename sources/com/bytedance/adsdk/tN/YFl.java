package com.bytedance.adsdk.tN;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.core.app.NotificationCompat;
import com.bytedance.adsdk.Sg.AlY;
import com.bytedance.adsdk.Sg.nc;
import com.bytedance.adsdk.Sg.vc;
import com.bytedance.adsdk.ugeno.DSW.qsH;
import com.bytedance.adsdk.ugeno.DSW.tN;
import com.bytedance.adsdk.ugeno.Sg.Sg;
import com.bytedance.adsdk.ugeno.YFl;
import com.google.android.gms.common.internal.ImagesContract;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.HashMap;

/* loaded from: classes.dex */
public class YFl extends Sg<vc> {
    private boolean ECi;
    private boolean Gmi;
    private String Gnp;
    private float IXB;
    private float VJb;
    protected ImageView.ScaleType YFl;
    private boolean dU;

    /* renamed from: ni, reason: collision with root package name */
    private String f10227ni;

    /* renamed from: xg, reason: collision with root package name */
    private HashMap<String, Bitmap> f10228xg;

    /* renamed from: com.bytedance.adsdk.tN.YFl$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements AlY {
        public AnonymousClass1() {
        }

        @Override // com.bytedance.adsdk.Sg.AlY
        public Bitmap YFl(final nc ncVar) {
            final String str;
            if (ncVar == null) {
                return null;
            }
            String NjR = ncVar.NjR();
            String qsH = ncVar.qsH();
            if (!TextUtils.isEmpty(NjR) && TextUtils.isEmpty(qsH)) {
                str = com.bytedance.adsdk.ugeno.tN.Sg.YFl(NjR, ((Sg) YFl.this).AlY);
            } else if (!TextUtils.isEmpty(qsH) && TextUtils.isEmpty(NjR)) {
                str = com.bytedance.adsdk.ugeno.tN.Sg.YFl(qsH, ((Sg) YFl.this).AlY);
            } else if (!TextUtils.isEmpty(qsH) && !TextUtils.isEmpty(NjR)) {
                str = com.bytedance.adsdk.ugeno.tN.Sg.YFl(NjR, ((Sg) YFl.this).AlY) + com.bytedance.adsdk.ugeno.tN.Sg.YFl(qsH, ((Sg) YFl.this).AlY);
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Bitmap bitmap = (Bitmap) YFl.this.f10228xg.get(str);
            if (bitmap != null) {
                return bitmap;
            }
            com.bytedance.adsdk.ugeno.AlY.YFl().Sg().YFl(((Sg) YFl.this).NjR, str, new YFl.InterfaceC0065YFl() { // from class: com.bytedance.adsdk.tN.YFl.1.1
                @Override // com.bytedance.adsdk.ugeno.YFl.InterfaceC0065YFl
                public void YFl(Bitmap bitmap2) {
                    if (bitmap2 != null) {
                        final Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, ncVar.YFl(), ncVar.Sg(), false);
                        YFl.this.f10228xg.put(str, createScaledBitmap);
                        qsH.YFl(new Runnable() { // from class: com.bytedance.adsdk.tN.YFl.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((vc) ((Sg) YFl.this).wN).YFl(ncVar.DSW(), createScaledBitmap);
                            }
                        });
                    }
                }
            });
            return (Bitmap) YFl.this.f10228xg.get(str);
        }
    }

    public YFl(Context context) {
        super(context);
        this.f10227ni = "images";
        this.IXB = 1.0f;
        this.YFl = ImageView.ScaleType.FIT_CENTER;
        this.f10228xg = new HashMap<>();
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
            case 97441490:
                if (str.equals("fitXY")) {
                    c10 = 4;
                    break;
                }
                break;
            case 520762310:
                if (str.equals("fitCenter")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1161480325:
                if (str.equals("centerCrop")) {
                    c10 = 6;
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
                return ImageView.ScaleType.FIT_XY;
            case 5:
                return ImageView.ScaleType.FIT_CENTER;
            case 6:
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    private String wN(String str) {
        return (!TextUtils.isEmpty(str) && str.contains(ImagesContract.LOCAL)) ? str.contains("shake_phone") ? "lottie_json/shake_phone.json" : str.contains("swipe_right") ? "lottie_json/swipe_right.json" : "" : "";
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    public void Sg() {
        super.Sg();
        ((vc) this.wN).setProgress(this.VJb);
        if (this.IXB <= 0.0f) {
            this.IXB = 1.0f;
        }
        ((vc) this.wN).setSpeed(this.IXB);
        if (this.Gnp.startsWith(ImagesContract.LOCAL)) {
            ((vc) this.wN).setAnimation(wN(this.Gnp));
            ((vc) this.wN).setImageAssetsFolder(this.f10227ni);
        } else {
            ((vc) this.wN).setAnimationFromUrl(this.Gnp);
        }
        ((vc) this.wN).setImageAssetDelegate(new AnonymousClass1());
        ((vc) this.wN).setScaleType(this.YFl);
        ((vc) this.wN).YFl(this.dU);
        tN();
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public vc AlY() {
        vc vcVar = new vc(this.Sg);
        vcVar.YFl(this);
        return vcVar;
    }

    public void tN() {
        ((vc) this.wN).YFl();
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
            case -1877911644:
                if (str.equals("scaleType")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals(NotificationCompat.CATEGORY_PROGRESS)) {
                    c10 = 1;
                    break;
                }
                break;
            case -878289888:
                if (str.equals("imagePath")) {
                    c10 = 2;
                    break;
                }
                break;
            case -291235277:
                if (str.equals("autoReverse")) {
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
            case 3327652:
                if (str.equals("loop")) {
                    c10 = 5;
                    break;
                }
                break;
            case 109641799:
                if (str.equals("speed")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1438608771:
                if (str.equals("autoPlay")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.YFl = vc(str2);
                return;
            case 1:
                this.VJb = tN.YFl(str2, 0.0f);
                return;
            case 2:
                this.f10227ni = str2;
                return;
            case 3:
                this.Gmi = tN.YFl(str2, false);
                return;
            case 4:
                this.Gnp = str2;
                return;
            case 5:
                this.dU = tN.YFl(str2, false);
                return;
            case 6:
                this.IXB = tN.YFl(str2, 1.0f);
                return;
            case 7:
                this.ECi = tN.YFl(str2, false);
                return;
            default:
                return;
        }
    }
}
