package com.bytedance.sdk.openadsdk.core.ugen.component;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.core.widget.GifView;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public class lMd extends com.bytedance.adsdk.ugeno.component.lMd<GifView> {
    protected ImageView.ScaleType DY;
    protected String zp;

    public lMd(Context context) {
        super(context);
        this.DY = ImageView.ScaleType.FIT_CENTER;
    }

    private ImageView.ScaleType COT(String str) {
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
        if (this.zp.startsWith("local://")) {
            ((GifView) this.COT).zp(com.bytedance.adsdk.ugeno.lMd.jU.lMd(this.lMd, this.zp.replace("local://", "")), false);
        } else {
            com.bytedance.adsdk.ugeno.KS.zp().lMd().zp(this.lMd, this.zp, (ImageView) this.COT);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    public void lMd() {
        super.lMd();
        ku();
        ((GifView) this.COT).setScaleType(this.DY);
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public GifView KS() {
        GifView gifView = new GifView(this.lMd);
        this.COT = gifView;
        return gifView;
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    public void zp(String str, String str2) {
        super.zp(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        if (str.equals("scaleType")) {
            this.DY = COT(str2);
        } else if (str.equals("src")) {
            this.zp = str2;
        }
    }
}
