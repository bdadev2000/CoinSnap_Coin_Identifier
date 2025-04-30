package com.bytedance.adsdk.ugeno.component.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.KS;
import com.bytedance.adsdk.ugeno.lMd.jU;
import com.bytedance.adsdk.ugeno.lMd.ku;
import com.bytedance.adsdk.ugeno.zp;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public class lMd extends com.bytedance.adsdk.ugeno.component.lMd<RoundImageView> {
    protected ImageView.ScaleType DY;
    protected boolean Rh;
    private int gH;
    private float rCC;
    protected String zp;

    public lMd(Context context) {
        super(context);
        this.DY = ImageView.ScaleType.FIT_CENTER;
        this.gH = -1;
        this.rCC = -1.0f;
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

    private void ku() {
        if (TextUtils.isEmpty(this.zp)) {
            return;
        }
        ((RoundImageView) this.COT).setImageDrawable(null);
        if (this.zp.startsWith("local://")) {
            ((RoundImageView) this.COT).setImageResource(jU.lMd(this.lMd, this.zp.replace("local://", "")));
        } else {
            if (this.zp.startsWith("@")) {
                try {
                    ((RoundImageView) this.COT).setImageResource(Integer.parseInt(this.zp.substring(1)));
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            KS.zp().lMd().zp(this.lMd, this.zp, this.rCC, new zp.InterfaceC0070zp() { // from class: com.bytedance.adsdk.ugeno.component.image.lMd.1
                @Override // com.bytedance.adsdk.ugeno.zp.InterfaceC0070zp
                public void zp(Bitmap bitmap) {
                    Bitmap zp;
                    if (bitmap == null) {
                        return;
                    }
                    ((RoundImageView) ((com.bytedance.adsdk.ugeno.component.lMd) lMd.this).COT).setImageBitmap(bitmap);
                    lMd lmd = lMd.this;
                    if (lmd.Rh && (zp = ku.zp(((com.bytedance.adsdk.ugeno.component.lMd) lmd).lMd, bitmap, 10)) != null) {
                        ((RoundImageView) ((com.bytedance.adsdk.ugeno.component.lMd) lMd.this).COT).setBackground(new BitmapDrawable(((com.bytedance.adsdk.ugeno.component.lMd) lMd.this).lMd.getResources(), zp));
                    }
                }
            });
        }
    }

    public void COT(String str) {
        this.zp = str;
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    public void lMd() {
        super.lMd();
        ku();
        ((RoundImageView) this.COT).setScaleType(this.DY);
        ((RoundImageView) this.COT).setBorderColor(this.eWG);
        ((RoundImageView) this.COT).setCornerRadius(this.cW);
        ((RoundImageView) this.COT).setBorderWidth(this.ffE);
        int i9 = this.gH;
        if (i9 != -1) {
            ((RoundImageView) this.COT).setColorFilter(i9);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public RoundImageView KS() {
        RoundImageView roundImageView = new RoundImageView(this.lMd);
        roundImageView.zp(this);
        return roundImageView;
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
            case -878696350:
                if (str.equals("imageBlur")) {
                    c9 = 1;
                    break;
                }
                break;
            case -372324943:
                if (str.equals("isBgGaussianBlur")) {
                    c9 = 2;
                    break;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    c9 = 3;
                    break;
                }
                break;
            case 1327599912:
                if (str.equals("tintColor")) {
                    c9 = 4;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                this.DY = HWF(str2);
                return;
            case 1:
                this.rCC = com.bytedance.adsdk.ugeno.lMd.KS.zp(str2, -1.0f);
                return;
            case 2:
                try {
                    this.Rh = Boolean.parseBoolean(str2);
                    return;
                } catch (NumberFormatException unused) {
                    this.Rh = false;
                    return;
                }
            case 3:
                this.zp = str2;
                return;
            case 4:
                this.gH = com.bytedance.adsdk.ugeno.lMd.zp.zp(str2);
                return;
            default:
                return;
        }
    }
}
