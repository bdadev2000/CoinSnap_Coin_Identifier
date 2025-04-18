package com.bytedance.sdk.openadsdk.core.GA.Sg;

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
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.component.utils.bZ;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.widget.Wwa;
import com.bytedance.sdk.openadsdk.utils.GA;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.qsH;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import j5.a;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import l5.g;

/* loaded from: classes.dex */
public class AlY extends wN {
    private float AfY;
    private TextView BPI;
    private View Bh;
    private float Bn;
    private TextView Cqy;
    private final int DjU;
    private TextView GS;
    private final Rect Gmi;
    private ColorStateList Gnp;
    private int Hjb;
    private final bZ Jc;
    private TextView Ld;
    private boolean RX;
    private float SVa;
    private TextView UI;
    private final int UT;
    private ImageView VB;
    private final Rect Vmj;
    private final Wwa YP;
    private int ZLB;
    private TextView ZU;
    private SeekBar dGX;
    private final Rect dU;

    /* renamed from: dd, reason: collision with root package name */
    private int f10627dd;
    private ImageView fIu;
    private TextView iY;

    /* renamed from: ib, reason: collision with root package name */
    private int f10628ib;
    private ColorStateList in;
    private float jz;
    private ColorStateList kA;
    private View ko;
    private int lL;
    private ImageView lu;
    private View mB;

    /* renamed from: ni, reason: collision with root package name */
    private float f10629ni;
    private final Rect qjy;
    private final View.OnTouchListener rE;
    private boolean tQ;
    private final Rect uGS;
    private ImageView zG;
    private int zz;

    public AlY(Context context, ViewGroup viewGroup, boolean z10, int i10, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, g gVar, boolean z11) {
        super(context, viewGroup, z10, i10, wwa, gVar, z11);
        this.Jc = new bZ(this);
        this.RX = false;
        this.tQ = false;
        this.f10628ib = 0;
        this.Hjb = 0;
        this.f10627dd = 0;
        this.lL = 0;
        this.zz = 0;
        this.Vmj = new Rect();
        this.uGS = new Rect();
        this.ZLB = 0;
        this.rE = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.AlY.7
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
        this.qjy = new Rect();
        this.Gmi = new Rect();
        this.dU = new Rect();
        this.YI = lG.YFl().getApplicationContext();
        AlY(z11);
        this.tN = viewGroup;
        this.wXo = z10;
        Wwa wwa2 = new Wwa(this);
        this.YP = wwa2;
        wwa2.YFl(this.wXo);
        DisplayMetrics displayMetrics = this.YI.getResources().getDisplayMetrics();
        this.UT = displayMetrics.widthPixels;
        this.DjU = displayMetrics.heightPixels;
        this.bZ = i10;
        this.pq = gVar;
        this.UZM = wwa;
        AlY(8);
        YFl(context, this.tN);
        AlY();
        YoT();
    }

    private void UZM() {
        DisplayMetrics displayMetrics = this.YI.getResources().getDisplayMetrics();
        TextView textView = this.Cqy;
        if (textView != null) {
            this.AfY = textView.getTextSize();
            this.Cqy.setTextSize(2, 14.0f);
            ColorStateList textColors = this.Cqy.getTextColors();
            this.kA = textColors;
            if (textColors != null) {
                this.Cqy.setTextColor(-1);
            }
            this.SVa = this.Cqy.getAlpha();
            this.Cqy.setAlpha(0.85f);
            this.Cqy.setShadowLayer(0.0f, GS.tN(this.YI, 0.5f), GS.tN(this.YI, 0.5f), qO.DSW(this.YI, "tt_b2000000"));
            ViewGroup.LayoutParams layoutParams = this.Cqy.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.qjy.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                GS.YFl(this.Cqy, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.qjy.top, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), this.qjy.bottom);
            }
        }
        TextView textView2 = this.Ld;
        if (textView2 != null) {
            this.jz = textView2.getTextSize();
            this.Ld.setTextSize(2, 14.0f);
            ColorStateList textColors2 = this.Ld.getTextColors();
            this.Gnp = textColors2;
            if (textColors2 != null) {
                this.Ld.setTextColor(-1);
            }
            this.f10629ni = this.Ld.getAlpha();
            this.Ld.setAlpha(0.85f);
            this.Ld.setShadowLayer(0.0f, GS.tN(this.YI, 0.5f), GS.tN(this.YI, 0.5f), qO.DSW(this.YI, "tt_b2000000"));
            ViewGroup.LayoutParams layoutParams2 = this.Ld.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                this.Gmi.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                TextView textView3 = this.Ld;
                int applyDimension = (int) TypedValue.applyDimension(1, 14.0f, displayMetrics);
                Rect rect = this.Gmi;
                GS.YFl(textView3, applyDimension, rect.top, rect.right, rect.bottom);
            }
        }
        ImageView imageView = this.VB;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                this.dU.set(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                ImageView imageView2 = this.VB;
                Rect rect2 = this.dU;
                GS.YFl(imageView2, rect2.left, rect2.top, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.dU.bottom);
            }
        }
        ImageView imageView3 = this.VB;
        if (imageView3 != null) {
            imageView3.setImageDrawable(qO.tN(this.YI, "tt_shrink_fullscreen"));
        }
        TextView textView4 = this.ZU;
        if (textView4 != null) {
            ColorStateList textColors3 = textView4.getTextColors();
            this.in = textColors3;
            if (textColors3 != null) {
                this.ZU.setTextColor(-1);
            }
            this.Bn = this.ZU.getAlpha();
            this.ZU.setAlpha(0.85f);
            ViewGroup.LayoutParams layoutParams4 = this.ZU.getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                this.uGS.set(marginLayoutParams4.leftMargin, marginLayoutParams4.topMargin, marginLayoutParams4.rightMargin, marginLayoutParams4.bottomMargin);
                TextView textView5 = this.ZU;
                int applyDimension2 = (int) TypedValue.applyDimension(1, 1.0f, displayMetrics);
                Rect rect3 = this.Gmi;
                GS.YFl(textView5, applyDimension2, rect3.top, rect3.right, rect3.bottom);
            }
        }
        View view = this.mB;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            this.ZLB = layoutParams5.height;
            layoutParams5.height = (int) TypedValue.applyDimension(1, 49.0f, displayMetrics);
            this.mB.setLayoutParams(layoutParams5);
            this.mB.setBackgroundResource(qO.AlY(this.YI, "tt_shadow_fullscreen_top"));
        }
        Sg(false, true);
    }

    private void YI() {
        TextView textView = this.Cqy;
        if (textView != null) {
            textView.setTextSize(0, this.AfY);
            ColorStateList colorStateList = this.kA;
            if (colorStateList != null) {
                this.Cqy.setTextColor(colorStateList);
            }
            this.Cqy.setAlpha(this.SVa);
            this.Cqy.setShadowLayer(GS.tN(this.YI, 1.0f), 0.0f, 0.0f, qO.DSW(this.YI, "tt_72000000"));
            TextView textView2 = this.Cqy;
            Rect rect = this.qjy;
            GS.YFl(textView2, rect.left, rect.top, rect.right, rect.bottom);
        }
        TextView textView3 = this.Ld;
        if (textView3 != null) {
            textView3.setTextSize(0, this.jz);
            ColorStateList colorStateList2 = this.Gnp;
            if (colorStateList2 != null) {
                this.Ld.setTextColor(colorStateList2);
            }
            this.Ld.setAlpha(this.f10629ni);
            this.Ld.setShadowLayer(GS.tN(this.YI, 1.0f), 0.0f, 0.0f, qO.DSW(this.YI, "tt_72000000"));
            TextView textView4 = this.Ld;
            Rect rect2 = this.Gmi;
            GS.YFl(textView4, rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        ImageView imageView = this.VB;
        if (imageView != null) {
            Rect rect3 = this.dU;
            GS.YFl(imageView, rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        ImageView imageView2 = this.VB;
        if (imageView2 != null) {
            imageView2.setImageDrawable(qO.tN(this.YI, "tt_enlarge_video"));
        }
        TextView textView5 = this.ZU;
        if (textView5 != null) {
            ColorStateList colorStateList3 = this.in;
            if (colorStateList3 != null) {
                textView5.setTextColor(colorStateList3);
            }
            this.ZU.setAlpha(this.Bn);
            TextView textView6 = this.ZU;
            Rect rect4 = this.Gmi;
            GS.YFl(textView6, rect4.left, rect4.top, rect4.right, rect4.bottom);
        }
        View view = this.mB;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.ZLB;
            this.mB.setLayoutParams(layoutParams);
            this.mB.setBackground(qsH.YFl(this.YI, "tt_video_black_desc_gradient"));
        }
        Sg(false, true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.wN
    @SuppressLint({"ClickableViewAccessibility"})
    public void AlY() {
        int i10;
        super.AlY();
        this.YP.YFl(this.tN);
        ImageView imageView = this.lu;
        int i11 = 8;
        if (!this.wXo && (this.bZ & 1) != 1) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        GS.YFl((View) imageView, i10);
        this.lu.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.AlY.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (AlY.this.rkt()) {
                    AlY alY = AlY.this;
                    alY.dXO.tN(alY, view);
                }
            }
        });
        TextView textView = this.GS;
        if (!this.wXo || (this.bZ & 2) == 2) {
            i11 = 0;
        }
        GS.YFl((View) textView, i11);
        this.GS.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.AlY.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (AlY.this.rkt()) {
                    AlY alY = AlY.this;
                    alY.dXO.AlY(alY, view);
                }
            }
        });
        this.zG.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.AlY.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (AlY.this.rkt()) {
                    AlY alY = AlY.this;
                    alY.dXO.wN(alY, view);
                }
            }
        });
        this.fIu.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.AlY.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AlY.this.Sg(false, true);
                AlY.this.qsH();
                AlY.this.DSW();
                AlY.this.rkt();
            }
        });
        this.VB.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.AlY.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (AlY.this.rkt()) {
                    AlY alY = AlY.this;
                    alY.dXO.Sg(alY, view);
                }
            }
        });
        this.dGX.setThumbOffset(0);
        this.dGX.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.AlY.6
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i12, boolean z10) {
                if (AlY.this.rkt()) {
                    AlY alY = AlY.this;
                    alY.dXO.YFl(alY, i12, z10);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                if (!AlY.this.RX && AlY.this.YI != null) {
                    seekBar.setThumb(qsH.YFl(lG.YFl(), "tt_seek_thumb_press"));
                }
                if (AlY.this.rkt()) {
                    seekBar.setThumbOffset(0);
                    AlY alY = AlY.this;
                    alY.dXO.Sg(alY, seekBar.getProgress());
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (!AlY.this.RX && AlY.this.YI != null) {
                    seekBar.setThumb(qsH.YFl(lG.YFl(), "tt_seek_thumb_normal"));
                }
                if (AlY.this.rkt()) {
                    seekBar.setThumbOffset(0);
                    AlY alY = AlY.this;
                    alY.dXO.YFl(alY, seekBar.getProgress());
                }
            }
        });
        this.dGX.setOnTouchListener(this.rE);
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.wN
    public void DSW() {
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa;
        GS.vc(this.f10633vc);
        GS.vc(this.DSW);
        GS.wN(this.ko);
        if (this.qsH != null && (wwa = this.UZM) != null && wwa.BPI() != null && this.UZM.BPI().f23461f != null) {
            GS.vc(this.qsH);
            com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl(this.UZM.BPI().f23461f, this.UZM.BPI().f23457b, this.UZM.BPI().a, this.qsH, this.UZM);
        }
        if (this.wN.getVisibility() == 0) {
            GS.YFl((View) this.wN, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.wN
    public void NjR() {
        this.dGX.setProgress(0);
        this.dGX.setSecondaryProgress(0);
        this.Ld.setText(qO.YFl(this.YI, "tt_00_00"));
        this.Cqy.setText(qO.YFl(this.YI, "tt_00_00"));
        AlY(8);
        if (bZ()) {
            this.AlY.setVisibility(8);
        }
        ImageView imageView = this.qsH;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        AlY(8);
        GS.YFl(this.Bh, 8);
        GS.YFl(this.f10632nc, 8);
        GS.YFl((View) this.eT, 8);
        GS.YFl(this.YoT, 8);
        GS.YFl((View) this.GA, 8);
        GS.YFl((View) this.pDU, 8);
        GS.YFl((View) this.EH, 8);
        com.bytedance.sdk.openadsdk.core.widget.qO qOVar = this.Ga;
        if (qOVar != null) {
            qOVar.YFl(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.wN
    public void Sg(boolean z10) {
        int i10 = nc() ? this.DjU : this.lG;
        int i11 = nc() ? this.UT : this.Wwa;
        if (this.aIu <= 0 || this.qO <= 0 || i10 <= 0) {
            return;
        }
        if (!wXo() && !nc() && (this.bZ & 8) != 8) {
            i11 = GS.tN(this.YI, 228.0f);
        }
        int i12 = this.qO;
        int i13 = this.aIu;
        int i14 = (int) (i13 * ((i10 * 1.0f) / i12));
        if (i14 > i11) {
            i10 = (int) (i12 * ((i11 * 1.0f) / i13));
        } else {
            i11 = i14;
        }
        if (!z10 && !nc()) {
            i10 = this.lG;
            i11 = this.Wwa;
        }
        this.AlY.YFl(i10, i11);
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.wN, l5.a
    @SuppressLint({"ClickableViewAccessibility"})
    public /* bridge */ /* synthetic */ void YFl(Object obj, WeakReference weakReference, boolean z10) {
        YFl((com.bytedance.sdk.openadsdk.core.model.Wwa) obj, (WeakReference<Context>) weakReference, z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.wN, com.bytedance.sdk.openadsdk.core.widget.qO.Sg
    public void eT() {
        YFl(true, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.wN, com.bytedance.sdk.openadsdk.core.widget.qO.Sg
    public boolean nc() {
        return this.RX;
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.wN
    public void qsH() {
        GS.wN(this.f10633vc);
        GS.wN(this.ko);
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.wN
    public void tN(boolean z10) {
        int i10;
        TextView textView = this.UI;
        if (textView != null) {
            if (!this.wXo && z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            GS.YFl((View) textView, i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.wN
    public void vc() {
        this.Jc.removeMessages(1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.wN
    public void wN() {
        this.Jc.removeMessages(1);
        this.Jc.sendMessageDelayed(this.Jc.obtainMessage(1), AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.wN
    public void YFl(Context context, View view) {
        super.YFl(context, view);
        this.GS = (TextView) view.findViewById(GA.TMt);
        this.lu = (ImageView) view.findViewById(GA.dBO);
        this.mB = view.findViewById(GA.zl);
        this.zG = (ImageView) view.findViewById(GA.f10816dc);
        this.UI = (TextView) view.findViewById(GA.agS);
        this.ZU = (TextView) view.findViewById(GA.LL);
        this.BPI = (TextView) view.findViewById(GA.ww);
        this.ko = view.findViewById(GA.EAq);
        this.fIu = (ImageView) view.findViewById(GA.rog);
        TextView textView = (TextView) view.findViewById(GA.JT);
        this.iY = textView;
        textView.setText(qO.YFl(context, "tt_video_retry_des_txt"));
        this.dGX = (SeekBar) view.findViewById(GA.JGG);
        this.Ld = (TextView) view.findViewById(GA.f10823oa);
        this.Cqy = (TextView) view.findViewById(GA.Uv);
        this.Bh = view.findViewById(GA.JB);
        this.VB = (ImageView) view.findViewById(GA.f10820id);
        this.NjR = view.findViewById(GA.pm);
    }

    private void wN(boolean z10) {
        if (z10) {
            UZM();
        } else {
            YI();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.wN
    public void Sg(@Nullable ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        YoT.YFl("FullScreen", "Detail exitFullScreen.....");
        if (viewGroup == null || (viewGroup2 = this.tN) == null || !(viewGroup2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        this.RX = false;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.tN.getLayoutParams();
        marginLayoutParams.width = this.f10627dd;
        marginLayoutParams.height = this.lL;
        marginLayoutParams.leftMargin = this.Hjb;
        marginLayoutParams.topMargin = this.f10628ib;
        this.tN.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(3, this.zz);
            viewGroup.setLayoutParams(layoutParams2);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            Rect rect = this.Vmj;
            GS.YFl(viewGroup, rect.left, rect.top, rect.right, rect.bottom);
        }
        Sg(true);
        this.VB.setImageDrawable(qO.tN(this.YI, "tt_enlarge_video"));
        this.dGX.setThumb(qsH.YFl(this.YI, "tt_seek_thumb_normal"));
        this.dGX.setThumbOffset(0);
        a.c(this.tN, true);
        wN(this.RX);
        GS.YFl(this.mB, 8);
        if ((this.bZ & 2) == 2) {
            GS.YFl((View) this.GS, 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.wN
    public void YFl(String str) {
        TextView textView = this.UI;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.ZU;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.wN
    public void YFl(int i10) {
        View view = this.Bh;
        if (view == null || view.getVisibility() != 0) {
            this.dGX.setProgress(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.wN
    public void YFl(long j3, long j10) {
        this.Ld.setText(a.b(j10));
        this.Cqy.setText(a.b(j3));
        this.dGX.setProgress(a.a(j3, j10));
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.wN, l5.a
    public void YFl() {
        YFl(false, this.wXo);
        qO();
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.wN
    public void YFl(long j3) {
        this.Cqy.setText(a.b(j3));
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.wN
    @SuppressLint({"ClickableViewAccessibility"})
    public void YFl(com.bytedance.sdk.openadsdk.core.model.Wwa wwa, WeakReference<Context> weakReference, boolean z10) {
        String dd2;
        String YFl;
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa2;
        if (wwa == null) {
            return;
        }
        YFl(this.tN, lG.YFl());
        YFl(false, this.wXo);
        GS.YFl(this.f10632nc, 0);
        GS.YFl((View) this.eT, 0);
        GS.YFl(this.YoT, 0);
        if (this.eT != null && (wwa2 = this.UZM) != null && wwa2.BPI() != null && this.UZM.BPI().f23461f != null) {
            com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl(this.UZM.BPI().f23461f, this.UZM.BPI().f23457b, this.UZM.BPI().a, this.eT, this.UZM);
        }
        if (!TextUtils.isEmpty(wwa.zG())) {
            dd2 = wwa.zG();
        } else if (!TextUtils.isEmpty(wwa.Hjb())) {
            dd2 = wwa.Hjb();
        } else {
            dd2 = !TextUtils.isEmpty(wwa.dd()) ? wwa.dd() : "";
        }
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa3 = this.UZM;
        if (wwa3 != null && wwa3.dGX() != null && this.UZM.dGX().YFl() != null) {
            GS.YFl((View) this.GA, 0);
            GS.YFl((View) this.pDU, 4);
            if (this.GA != null) {
                com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl(this.UZM.dGX(), this.GA, wwa);
                this.GA.setOnClickListener(this.mn);
                this.GA.setOnTouchListener(this.mn);
            }
        } else if (!TextUtils.isEmpty(dd2)) {
            GS.YFl((View) this.GA, 4);
            GS.YFl((View) this.pDU, 0);
            TextView textView = this.pDU;
            if (textView != null) {
                textView.setText(dd2.substring(0, 1));
                this.pDU.setOnClickListener(this.mn);
                this.pDU.setOnTouchListener(this.mn);
            }
        }
        if (this.EH != null && !TextUtils.isEmpty(dd2)) {
            this.EH.setText(dd2);
        }
        GS.YFl((View) this.EH, 0);
        GS.YFl((View) this.rkt, 0);
        int ko = wwa.ko();
        if (ko == 4) {
            YFl = qO.YFl(this.YI, "tt_video_download_apk");
        } else if (ko != 5) {
            YFl = qO.YFl(this.YI, "tt_video_mobile_go_detail");
        } else {
            YFl = qO.YFl(this.YI, "tt_video_dial_phone");
        }
        TextView textView2 = this.rkt;
        if (textView2 != null) {
            textView2.setText(YFl);
            this.rkt.setOnClickListener(this.mn);
            this.rkt.setOnTouchListener(this.mn);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.wN
    public boolean Sg(int i10) {
        SeekBar seekBar = this.dGX;
        return seekBar != null && i10 > seekBar.getSecondaryProgress();
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.wN
    public void YFl(@Nullable ViewGroup viewGroup) {
        if (viewGroup != null && (this.tN.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            this.RX = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.tN.getLayoutParams();
            this.Hjb = marginLayoutParams.leftMargin;
            this.f10628ib = marginLayoutParams.topMargin;
            this.f10627dd = marginLayoutParams.width;
            this.lL = marginLayoutParams.height;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            this.tN.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int[] rules = layoutParams2.getRules();
                this.zz = rules.length > 0 ? rules[3] : 0;
                layoutParams2.addRule(3, 0);
                viewGroup.setLayoutParams(layoutParams2);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                this.Vmj.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                GS.YFl(viewGroup, 0, 0, 0, 0);
            }
            Sg(true);
            this.VB.setImageDrawable(qO.tN(this.YI, "tt_shrink_video"));
            this.dGX.setThumb(qsH.YFl(this.YI, "tt_seek_thumb_fullscreen_selector"));
            this.dGX.setThumbOffset(0);
            a.c(this.tN, false);
            wN(this.RX);
            GS.YFl(this.mB, 8);
            if (!this.wXo) {
                GS.YFl((View) this.lu, 8);
                GS.YFl((View) this.GS, 8);
            } else if ((this.bZ & 1) == 1) {
                GS.YFl((View) this.lu, 8);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.wN, com.bytedance.sdk.component.utils.bZ.YFl
    public void YFl(Message message) {
        if (message.what != 1) {
            return;
        }
        eT();
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.wN
    public void YFl(boolean z10, boolean z11, boolean z12) {
        GS.YFl(this.Bh, 0);
        if (this.RX) {
            GS.YFl(this.mB, 0);
            GS.YFl((View) this.ZU, 0);
        } else if (z12) {
            GS.YFl(this.mB, 8);
        }
        GS.YFl((View) this.wN, (!z10 || this.f10633vc.getVisibility() == 0) ? 8 : 0);
        if (!this.wXo && !this.RX) {
            if ((this.bZ & 1) != 1 && !z12) {
                GS.YFl((View) this.lu, 0);
            }
            GS.YFl((View) this.GS, z12 ? 8 : 0);
        }
        GS.YFl((View) this.Ld, 0);
        GS.YFl((View) this.Cqy, 0);
        GS.YFl((View) this.dGX, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.wN
    public void YFl(boolean z10, boolean z11) {
        GS.YFl(this.Bh, 8);
        GS.YFl(this.mB, 8);
        GS.YFl((View) this.wN, 8);
        if (!this.wXo && !this.RX) {
            GS.YFl((View) this.lu, 8);
            if ((this.bZ & 2) != 2) {
                GS.YFl((View) this.GS, 8);
            }
        } else if ((this.bZ & 1) == 1) {
            GS.YFl((View) this.lu, 8);
        }
        if (z11) {
            GS.YFl((View) this.lu, 8);
            GS.YFl((View) this.GS, 8);
        }
        tN(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.wN, com.bytedance.sdk.openadsdk.core.widget.Wwa.YFl
    public void YFl(View view, boolean z10) {
        if (nc()) {
            String format = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
            com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.UZM;
            if (wwa != null && !TextUtils.isEmpty(wwa.Hjb())) {
                YFl(this.UZM.Hjb());
            }
            this.BPI.setText(format);
        } else {
            YFl("");
            this.BPI.setText("");
        }
        if (this.Cfr) {
            return;
        }
        tN(this.wXo && !this.RX);
        if (rkt()) {
            this.dXO.YFl(this, view, true, this.f10633vc.getVisibility() != 0);
        }
    }
}
