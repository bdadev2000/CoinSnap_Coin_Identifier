package com.bytedance.sdk.openadsdk.core.eT.Sg;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.core.widget.wN;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public class Sg extends com.bytedance.adsdk.ugeno.Sg.Sg<wN> {
    protected ImageView.ScaleType Gnp;
    protected String YFl;

    public Sg(Context context) {
        super(context);
        this.Gnp = ImageView.ScaleType.FIT_CENTER;
    }

    private void tN() {
        if (TextUtils.isEmpty(this.YFl)) {
            return;
        }
        if (this.YFl.startsWith("local://")) {
            ((wN) this.wN).YFl(com.bytedance.adsdk.ugeno.DSW.AlY.YFl(this.Sg, this.YFl.replace("local://", "")), false);
        } else {
            com.bytedance.adsdk.ugeno.AlY.YFl().Sg().YFl(this.NjR, this.YFl, (ImageView) this.wN);
        }
    }

    private ImageView.ScaleType wN(String str) {
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

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    public void Sg() {
        super.Sg();
        tN();
        ((wN) this.wN).setScaleType(this.Gnp);
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public wN AlY() {
        wN wNVar = new wN(this.Sg);
        this.wN = wNVar;
        return wNVar;
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    public void YFl(String str, String str2) {
        super.YFl(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        if (str.equals("scaleType")) {
            this.Gnp = wN(str2);
        } else if (str.equals("src")) {
            this.YFl = str2;
        }
    }
}
