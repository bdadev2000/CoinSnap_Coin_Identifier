package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.RCv;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.ku;
import com.bytedance.sdk.openadsdk.utils.vDp;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public class jU extends COT {
    private ImageView BO;
    private final com.bytedance.sdk.openadsdk.core.widget.jU CZ;
    private SeekBar DY;
    private ColorStateList Eg;
    private final Rect Fm;
    private int GP;
    private View Iv;
    private final RCv MBR;
    private float Ml;
    private float Np;
    private TextView Pxi;
    private final int REM;
    private final Rect Rea;
    private TextView Rg;
    private TextView Rh;
    private float TS;
    private TextView UPs;
    private int Vjb;
    private final Rect VuU;
    private final Rect YcG;
    private ImageView aax;
    private float bQm;
    private final int bX;
    private TextView eWG;
    private float eyb;
    private ImageView fRl;
    private ColorStateList fVt;
    private View ffE;
    private boolean fgJ;
    private int fs;
    private TextView gH;
    private ColorStateList iOI;
    private int mW;
    private boolean oB;
    private TextView oKZ;
    private int qtv;
    private ImageView rCC;
    private View si;
    private final Rect sqt;
    private final View.OnTouchListener vLi;
    private int zpV;

    public jU(Context context, ViewGroup viewGroup, boolean z8, int i9, woN won, com.bykv.vk.openvk.component.video.api.jU.KS ks, boolean z9) {
        super(context, viewGroup, z8, i9, won, ks, z9);
        this.MBR = new RCv(this);
        this.oB = false;
        this.fgJ = false;
        this.qtv = 0;
        this.Vjb = 0;
        this.fs = 0;
        this.GP = 0;
        this.mW = 0;
        this.sqt = new Rect();
        this.YcG = new Rect();
        this.zpV = 0;
        this.vLi = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.jU.7
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        view.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                } else {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                return false;
            }
        };
        this.Rea = new Rect();
        this.VuU = new Rect();
        this.Fm = new Rect();
        this.ox = KVG.zp().getApplicationContext();
        jU(z9);
        this.zp = viewGroup;
        this.pvr = z8;
        com.bytedance.sdk.openadsdk.core.widget.jU jUVar = new com.bytedance.sdk.openadsdk.core.widget.jU(this);
        this.CZ = jUVar;
        jUVar.zp(this.pvr);
        DisplayMetrics displayMetrics = this.ox.getResources().getDisplayMetrics();
        this.REM = displayMetrics.widthPixels;
        this.bX = displayMetrics.heightPixels;
        this.ot = i9;
        this.QUv = ks;
        this.yRU = won;
        jU(8);
        zp(context, this.zp);
        jU();
        vDp();
    }

    private void Lij() {
        TextView textView = this.gH;
        if (textView != null) {
            textView.setTextSize(0, this.bQm);
            ColorStateList colorStateList = this.Eg;
            if (colorStateList != null) {
                this.gH.setTextColor(colorStateList);
            }
            this.gH.setAlpha(this.TS);
            this.gH.setShadowLayer(WNy.lMd(this.ox, 1.0f), 0.0f, 0.0f, cz.ku(this.ox, "tt_video_shadow_color"));
            TextView textView2 = this.gH;
            Rect rect = this.Rea;
            WNy.lMd(textView2, rect.left, rect.top, rect.right, rect.bottom);
        }
        TextView textView3 = this.Rh;
        if (textView3 != null) {
            textView3.setTextSize(0, this.Ml);
            ColorStateList colorStateList2 = this.iOI;
            if (colorStateList2 != null) {
                this.Rh.setTextColor(colorStateList2);
            }
            this.Rh.setAlpha(this.eyb);
            this.Rh.setShadowLayer(WNy.lMd(this.ox, 1.0f), 0.0f, 0.0f, cz.ku(this.ox, "tt_video_shadow_color"));
            TextView textView4 = this.Rh;
            Rect rect2 = this.VuU;
            WNy.lMd(textView4, rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        ImageView imageView = this.rCC;
        if (imageView != null) {
            Rect rect3 = this.Fm;
            WNy.lMd(imageView, rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        ImageView imageView2 = this.rCC;
        if (imageView2 != null) {
            imageView2.setImageDrawable(cz.KS(this.ox, "tt_enlarge_video"));
        }
        TextView textView5 = this.Pxi;
        if (textView5 != null) {
            ColorStateList colorStateList3 = this.fVt;
            if (colorStateList3 != null) {
                textView5.setTextColor(colorStateList3);
            }
            this.Pxi.setAlpha(this.Np);
            TextView textView6 = this.Pxi;
            Rect rect4 = this.VuU;
            WNy.lMd(textView6, rect4.left, rect4.top, rect4.right, rect4.bottom);
        }
        View view = this.ffE;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.zpV;
            this.ffE.setLayoutParams(layoutParams);
            this.ffE.setBackground(ku.zp(this.ox, "tt_video_black_desc_gradient"));
        }
        lMd(false, true);
    }

    private void RCv() {
        DisplayMetrics displayMetrics = this.ox.getResources().getDisplayMetrics();
        TextView textView = this.gH;
        if (textView != null) {
            this.bQm = textView.getTextSize();
            this.gH.setTextSize(2, 14.0f);
            ColorStateList textColors = this.gH.getTextColors();
            this.Eg = textColors;
            if (textColors != null) {
                this.gH.setTextColor(cz.ku(this.ox, "tt_ssxinzi15"));
            }
            this.TS = this.gH.getAlpha();
            this.gH.setAlpha(0.85f);
            this.gH.setShadowLayer(0.0f, WNy.lMd(this.ox, 0.5f), WNy.lMd(this.ox, 0.5f), cz.ku(this.ox, "tt_video_shaoow_color_fullscreen"));
            ViewGroup.LayoutParams layoutParams = this.gH.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.Rea.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                WNy.lMd(this.gH, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.Rea.top, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), this.Rea.bottom);
            }
        }
        TextView textView2 = this.Rh;
        if (textView2 != null) {
            this.Ml = textView2.getTextSize();
            this.Rh.setTextSize(2, 14.0f);
            ColorStateList textColors2 = this.Rh.getTextColors();
            this.iOI = textColors2;
            if (textColors2 != null) {
                this.Rh.setTextColor(cz.ku(this.ox, "tt_ssxinzi15"));
            }
            this.eyb = this.Rh.getAlpha();
            this.Rh.setAlpha(0.85f);
            this.Rh.setShadowLayer(0.0f, WNy.lMd(this.ox, 0.5f), WNy.lMd(this.ox, 0.5f), cz.ku(this.ox, "tt_video_shaoow_color_fullscreen"));
            ViewGroup.LayoutParams layoutParams2 = this.Rh.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                this.VuU.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                TextView textView3 = this.Rh;
                int applyDimension = (int) TypedValue.applyDimension(1, 14.0f, displayMetrics);
                Rect rect = this.VuU;
                WNy.lMd(textView3, applyDimension, rect.top, rect.right, rect.bottom);
            }
        }
        ImageView imageView = this.rCC;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                this.Fm.set(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                ImageView imageView2 = this.rCC;
                Rect rect2 = this.Fm;
                WNy.lMd(imageView2, rect2.left, rect2.top, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.Fm.bottom);
            }
        }
        ImageView imageView3 = this.rCC;
        if (imageView3 != null) {
            imageView3.setImageDrawable(cz.KS(this.ox, "tt_shrink_fullscreen"));
        }
        TextView textView4 = this.Pxi;
        if (textView4 != null) {
            ColorStateList textColors3 = textView4.getTextColors();
            this.fVt = textColors3;
            if (textColors3 != null) {
                this.Pxi.setTextColor(cz.ku(this.ox, "tt_ssxinzi15"));
            }
            this.Np = this.Pxi.getAlpha();
            this.Pxi.setAlpha(0.85f);
            ViewGroup.LayoutParams layoutParams4 = this.Pxi.getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                this.YcG.set(marginLayoutParams4.leftMargin, marginLayoutParams4.topMargin, marginLayoutParams4.rightMargin, marginLayoutParams4.bottomMargin);
                TextView textView5 = this.Pxi;
                int applyDimension2 = (int) TypedValue.applyDimension(1, 1.0f, displayMetrics);
                Rect rect3 = this.VuU;
                WNy.lMd(textView5, applyDimension2, rect3.top, rect3.right, rect3.bottom);
            }
        }
        View view = this.ffE;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            this.zpV = layoutParams5.height;
            layoutParams5.height = (int) TypedValue.applyDimension(1, 49.0f, displayMetrics);
            this.ffE.setLayoutParams(layoutParams5);
            this.ffE.setBackgroundResource(cz.jU(this.ox, "tt_shadow_fullscreen_top"));
        }
        lMd(false, true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.COT, com.bytedance.sdk.openadsdk.core.widget.COT.lMd
    public void Bj() {
        zp(true, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.COT
    public void COT() {
        this.MBR.removeMessages(1);
        this.MBR.sendMessageDelayed(this.MBR.obtainMessage(1), AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.COT
    public void HWF() {
        this.MBR.removeMessages(1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.COT
    public void KS(boolean z8) {
        int i9;
        TextView textView = this.eWG;
        if (textView != null) {
            if (!this.pvr && z8) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            WNy.zp((View) textView, i9);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.COT
    public void QR() {
        woN won;
        WNy.HWF(this.jU);
        WNy.HWF(this.COT);
        WNy.COT(this.Iv);
        if (this.HWF != null && (won = this.yRU) != null && won.eWG() != null && this.yRU.eWG().dT() != null) {
            WNy.HWF(this.HWF);
            com.bytedance.sdk.openadsdk.Bj.KS.zp().zp(this.yRU.eWG().dT(), this.yRU.eWG().KS(), this.yRU.eWG().lMd(), this.HWF, this.yRU);
        }
        if (this.KS.getVisibility() == 0) {
            WNy.zp((View) this.KS, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.COT
    public void YW() {
        this.DY.setProgress(0);
        this.DY.setSecondaryProgress(0);
        this.Rh.setText(cz.lMd(this.ox, "tt_00_00"));
        this.gH.setText(cz.lMd(this.ox, "tt_00_00"));
        jU(8);
        if (ox()) {
            this.lMd.setVisibility(8);
        }
        ImageView imageView = this.HWF;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        jU(8);
        WNy.zp(this.si, 8);
        WNy.zp(this.ku, 8);
        WNy.zp((View) this.YW, 8);
        WNy.zp(this.dT, 8);
        WNy.zp((View) this.Bj, 8);
        WNy.zp((View) this.vDp, 8);
        WNy.zp((View) this.tG, 8);
        com.bytedance.sdk.openadsdk.core.widget.COT cot = this.RCv;
        if (cot != null) {
            cot.zp(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.COT, com.bytedance.sdk.openadsdk.core.widget.COT.lMd
    public boolean dT() {
        return this.oB;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.COT
    @SuppressLint({"ClickableViewAccessibility"})
    public void jU() {
        int i9;
        super.jU();
        this.CZ.zp(this.zp);
        ImageView imageView = this.fRl;
        int i10 = 8;
        if (!this.pvr && (this.ot & 1) != 1) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        WNy.zp((View) imageView, i9);
        this.fRl.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.jU.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (jU.this.KVG()) {
                    jU jUVar = jU.this;
                    jUVar.Lij.KS(jUVar, view);
                }
            }
        });
        TextView textView = this.UPs;
        if (!this.pvr || (this.ot & 2) == 2) {
            i10 = 0;
        }
        WNy.zp((View) textView, i10);
        this.UPs.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.jU.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (jU.this.KVG()) {
                    jU jUVar = jU.this;
                    jUVar.Lij.jU(jUVar, view);
                }
            }
        });
        this.BO.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.jU.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (jU.this.KVG()) {
                    jU jUVar = jU.this;
                    jUVar.Lij.COT(jUVar, view);
                }
            }
        });
        this.aax.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.jU.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                jU.this.lMd(false, true);
                jU.this.ku();
                jU.this.QR();
                jU.this.KVG();
            }
        });
        this.rCC.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.jU.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (jU.this.KVG()) {
                    jU jUVar = jU.this;
                    jUVar.Lij.lMd(jUVar, view);
                }
            }
        });
        this.DY.setThumbOffset(0);
        this.DY.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.jU.6
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i11, boolean z8) {
                if (jU.this.KVG()) {
                    jU jUVar = jU.this;
                    jUVar.Lij.zp(jUVar, i11, z8);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                if (!jU.this.oB && jU.this.ox != null) {
                    seekBar.setThumb(ku.zp(KVG.zp(), "tt_seek_thumb_press"));
                }
                if (jU.this.KVG()) {
                    seekBar.setThumbOffset(0);
                    jU jUVar = jU.this;
                    jUVar.Lij.lMd(jUVar, seekBar.getProgress());
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (!jU.this.oB && jU.this.ox != null) {
                    seekBar.setThumb(ku.zp(KVG.zp(), "tt_seek_thumb_normal"));
                }
                if (jU.this.KVG()) {
                    seekBar.setThumbOffset(0);
                    jU jUVar = jU.this;
                    jUVar.Lij.zp(jUVar, seekBar.getProgress());
                }
            }
        });
        this.DY.setOnTouchListener(this.vLi);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.COT
    public void ku() {
        WNy.COT(this.jU);
        WNy.COT(this.Iv);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.COT
    public void lMd(boolean z8) {
        int i9 = dT() ? this.bX : this.dQp;
        int i10 = dT() ? this.REM : this.KVG;
        if (this.vwr <= 0 || this.woN <= 0 || i9 <= 0) {
            return;
        }
        if (!FP() && !dT() && (this.ot & 8) != 8) {
            i10 = this.ox.getResources().getDimensionPixelSize(cz.QR(this.ox, "tt_video_container_maxheight"));
        }
        int i11 = this.woN;
        int i12 = this.vwr;
        int i13 = (int) (i12 * ((i9 * 1.0f) / i11));
        if (i13 > i10) {
            i9 = (int) (i11 * ((i10 * 1.0f) / i12));
        } else {
            i10 = i13;
        }
        if (!z8 && !dT()) {
            i9 = this.dQp;
            i10 = this.KVG;
        }
        this.lMd.zp(i9, i10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.COT, com.bykv.vk.openvk.component.video.api.jU.lMd
    @SuppressLint({"ClickableViewAccessibility"})
    public /* bridge */ /* synthetic */ void zp(woN won, WeakReference weakReference, boolean z8) {
        zp(won, (WeakReference<Context>) weakReference, z8);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.COT
    public void zp(Context context, View view) {
        super.zp(context, view);
        this.UPs = (TextView) view.findViewById(vDp.FGx);
        this.fRl = (ImageView) view.findViewById(vDp.uVa);
        this.ffE = view.findViewById(vDp.NJ);
        this.BO = (ImageView) view.findViewById(vDp.WLq);
        this.eWG = (TextView) view.findViewById(vDp.Ay);
        this.Pxi = (TextView) view.findViewById(vDp.Dp);
        this.oKZ = (TextView) view.findViewById(vDp.LU);
        this.Iv = view.findViewById(vDp.jQ);
        this.aax = (ImageView) view.findViewById(vDp.qJZ);
        TextView textView = (TextView) view.findViewById(vDp.KVS);
        this.Rg = textView;
        textView.setText(cz.zp(context, "tt_video_retry_des_txt"));
        this.DY = (SeekBar) view.findViewById(vDp.lT);
        this.Rh = (TextView) view.findViewById(vDp.yI);
        this.gH = (TextView) view.findViewById(vDp.uOT);
        this.si = view.findViewById(vDp.led);
        this.rCC = (ImageView) view.findViewById(vDp.KL);
        this.QR = view.findViewById(vDp.sm);
    }

    private void COT(boolean z8) {
        if (z8) {
            RCv();
        } else {
            Lij();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.COT
    public void lMd(@Nullable ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        tG.zp("FullScreen", "Detail exitFullScreen.....");
        if (viewGroup == null || (viewGroup2 = this.zp) == null || !(viewGroup2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        this.oB = false;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.zp.getLayoutParams();
        marginLayoutParams.width = this.fs;
        marginLayoutParams.height = this.GP;
        marginLayoutParams.leftMargin = this.Vjb;
        marginLayoutParams.topMargin = this.qtv;
        this.zp.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(3, this.mW);
            viewGroup.setLayoutParams(layoutParams2);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            Rect rect = this.sqt;
            WNy.lMd(viewGroup, rect.left, rect.top, rect.right, rect.bottom);
        }
        lMd(true);
        this.rCC.setImageDrawable(cz.KS(this.ox, "tt_enlarge_video"));
        this.DY.setThumb(ku.zp(this.ox, "tt_seek_thumb_normal"));
        this.DY.setThumbOffset(0);
        com.bykv.vk.openvk.component.video.zp.COT.zp.zp((View) this.zp, true);
        COT(this.oB);
        WNy.zp(this.ffE, 8);
        if ((this.ot & 2) == 2) {
            WNy.zp((View) this.UPs, 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.COT
    public void zp(String str) {
        TextView textView = this.eWG;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.Pxi;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.COT
    public void zp(int i9) {
        View view = this.si;
        if (view == null || view.getVisibility() != 0) {
            this.DY.setProgress(i9);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.COT
    public void zp(long j7, long j9) {
        this.Rh.setText(com.bykv.vk.openvk.component.video.zp.COT.zp.zp(j9));
        this.gH.setText(com.bykv.vk.openvk.component.video.zp.COT.zp.zp(j7));
        this.DY.setProgress(com.bykv.vk.openvk.component.video.zp.COT.zp.zp(j7, j9));
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.COT, com.bykv.vk.openvk.component.video.api.jU.lMd
    public void zp() {
        zp(false, this.pvr);
        pvr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.COT
    public void zp(long j7) {
        this.gH.setText(com.bykv.vk.openvk.component.video.zp.COT.zp.zp(j7));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.COT
    @SuppressLint({"ClickableViewAccessibility"})
    public void zp(woN won, WeakReference<Context> weakReference, boolean z8) {
        String str;
        String zp;
        woN won2;
        if (won == null) {
            return;
        }
        zp(this.zp, KVG.zp());
        zp(false, this.pvr);
        WNy.zp(this.ku, 0);
        WNy.zp((View) this.YW, 0);
        WNy.zp(this.dT, 0);
        if (this.YW != null && (won2 = this.yRU) != null && won2.eWG() != null && this.yRU.eWG().dT() != null) {
            com.bytedance.sdk.openadsdk.Bj.KS.zp().zp(this.yRU.eWG().dT(), this.yRU.eWG().KS(), this.yRU.eWG().lMd(), this.YW, this.yRU);
        }
        if (!TextUtils.isEmpty(won.Pxi())) {
            str = won.Pxi();
        } else if (!TextUtils.isEmpty(won.rCC())) {
            str = won.rCC();
        } else if (!TextUtils.isEmpty(won.MBR())) {
            str = won.MBR();
        } else {
            str = "";
        }
        woN won3 = this.yRU;
        if (won3 != null && won3.BO() != null && this.yRU.BO().zp() != null) {
            WNy.zp((View) this.Bj, 0);
            WNy.zp((View) this.vDp, 4);
            if (this.Bj != null) {
                com.bytedance.sdk.openadsdk.Bj.KS.zp().zp(this.yRU.BO(), this.Bj, won);
                this.Bj.setOnClickListener(this.cW);
                this.Bj.setOnTouchListener(this.cW);
            }
        } else if (!TextUtils.isEmpty(str)) {
            WNy.zp((View) this.Bj, 4);
            WNy.zp((View) this.vDp, 0);
            TextView textView = this.vDp;
            if (textView != null) {
                textView.setText(str.substring(0, 1));
                this.vDp.setOnClickListener(this.cW);
                this.vDp.setOnTouchListener(this.cW);
            }
        }
        if (this.tG != null && !TextUtils.isEmpty(str)) {
            this.tG.setText(str);
        }
        WNy.zp((View) this.tG, 0);
        WNy.zp((View) this.rV, 0);
        int oKZ = won.oKZ();
        if (oKZ == 4) {
            zp = cz.zp(this.ox, "tt_video_download_apk");
        } else if (oKZ != 5) {
            zp = cz.zp(this.ox, "tt_video_mobile_go_detail");
        } else {
            zp = cz.zp(this.ox, "tt_video_dial_phone");
        }
        TextView textView2 = this.rV;
        if (textView2 != null) {
            textView2.setText(zp);
            this.rV.setOnClickListener(this.cW);
            this.rV.setOnTouchListener(this.cW);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.COT
    public boolean lMd(int i9) {
        SeekBar seekBar = this.DY;
        return seekBar != null && i9 > seekBar.getSecondaryProgress();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.COT
    public void zp(@Nullable ViewGroup viewGroup) {
        if (viewGroup != null && (this.zp.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            this.oB = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.zp.getLayoutParams();
            this.Vjb = marginLayoutParams.leftMargin;
            this.qtv = marginLayoutParams.topMargin;
            this.fs = marginLayoutParams.width;
            this.GP = marginLayoutParams.height;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            this.zp.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int[] rules = layoutParams2.getRules();
                this.mW = rules.length > 0 ? rules[3] : 0;
                layoutParams2.addRule(3, 0);
                viewGroup.setLayoutParams(layoutParams2);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                this.sqt.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                WNy.lMd(viewGroup, 0, 0, 0, 0);
            }
            lMd(true);
            this.rCC.setImageDrawable(cz.KS(this.ox, "tt_shrink_video"));
            this.DY.setThumb(ku.zp(this.ox, "tt_seek_thumb_fullscreen_selector"));
            this.DY.setThumbOffset(0);
            com.bykv.vk.openvk.component.video.zp.COT.zp.zp((View) this.zp, false);
            COT(this.oB);
            WNy.zp(this.ffE, 8);
            if (!this.pvr) {
                WNy.zp((View) this.fRl, 8);
                WNy.zp((View) this.UPs, 8);
            } else if ((this.ot & 1) == 1) {
                WNy.zp((View) this.fRl, 8);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.COT, com.bytedance.sdk.component.utils.RCv.zp
    public void zp(Message message) {
        if (message.what != 1) {
            return;
        }
        Bj();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.COT
    public void zp(boolean z8, boolean z9, boolean z10) {
        WNy.zp(this.si, 0);
        if (this.oB) {
            WNy.zp(this.ffE, 0);
            WNy.zp((View) this.Pxi, 0);
        } else if (z10) {
            WNy.zp(this.ffE, 8);
        }
        WNy.zp((View) this.KS, (!z8 || this.jU.getVisibility() == 0) ? 8 : 0);
        if (!this.pvr && !this.oB) {
            if ((this.ot & 1) != 1 && !z10) {
                WNy.zp((View) this.fRl, 0);
            }
            WNy.zp((View) this.UPs, z10 ? 8 : 0);
        }
        WNy.zp((View) this.Rh, 0);
        WNy.zp((View) this.gH, 0);
        WNy.zp((View) this.DY, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.COT
    public void zp(boolean z8, boolean z9) {
        WNy.zp(this.si, 8);
        WNy.zp(this.ffE, 8);
        WNy.zp((View) this.KS, 8);
        if (!this.pvr && !this.oB) {
            WNy.zp((View) this.fRl, 8);
            if ((this.ot & 2) != 2) {
                WNy.zp((View) this.UPs, 8);
            }
        } else if ((this.ot & 1) == 1) {
            WNy.zp((View) this.fRl, 8);
        }
        if (z9) {
            WNy.zp((View) this.fRl, 8);
            WNy.zp((View) this.UPs, 8);
        }
        KS(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.COT, com.bytedance.sdk.openadsdk.core.widget.jU.zp
    public void zp(View view, boolean z8) {
        if (dT()) {
            String format = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
            woN won = this.yRU;
            if (won != null && !TextUtils.isEmpty(won.rCC())) {
                zp(this.yRU.rCC());
            }
            this.oKZ.setText(format);
        } else {
            zp("");
            this.oKZ.setText("");
        }
        if (this.Gzh) {
            return;
        }
        KS(this.pvr && !this.oB);
        if (KVG()) {
            this.Lij.zp(this, view, true, this.jU.getVisibility() != 0);
        }
    }
}
