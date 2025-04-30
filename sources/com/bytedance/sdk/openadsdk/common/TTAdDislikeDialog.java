package com.bytedance.sdk.openadsdk.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.dislike.COT;
import com.bytedance.sdk.openadsdk.dislike.KS;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.vDp;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class TTAdDislikeDialog extends PAGFrameLayout {
    private boolean Bj;
    private View COT;
    private KS.lMd HWF;
    private TTDislikeListView KS;
    private KS.lMd QR;
    private zp YW;
    private Context dT;
    private RelativeLayout jU;
    private woN ku;
    private TTDislikeListView lMd;
    private com.bytedance.sdk.openadsdk.dislike.COT vDp;
    private View zp;

    /* loaded from: classes.dex */
    public interface zp {
        void lMd(View view);

        void zp(int i9, FilterWord filterWord);

        void zp(View view);
    }

    public TTAdDislikeDialog(@NonNull Context context, @NonNull woN won) {
        this(context.getApplicationContext());
        this.dT = context;
        this.ku = won;
        jU();
    }

    private void COT() {
        this.jU = (RelativeLayout) this.zp.findViewById(vDp.ITK);
        this.COT = this.zp.findViewById(vDp.vFs);
        PAGTextView pAGTextView = (PAGTextView) this.zp.findViewById(vDp.VgU);
        TextView textView = (TextView) this.zp.findViewById(vDp.JR);
        TextView textView2 = (TextView) this.zp.findViewById(vDp.gKR);
        textView.setText(cz.zp(getContext(), "tt_dislike_header_tv_back"));
        textView2.setText(cz.zp(getContext(), "tt_dislike_header_tv_title"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTAdDislikeDialog.this.HWF();
                if (TTAdDislikeDialog.this.YW != null) {
                    zp unused = TTAdDislikeDialog.this.YW;
                }
            }
        });
        if (pAGTextView != null) {
            pAGTextView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTAdDislikeDialog.this.KS();
                }
            });
        }
        TTDislikeListView tTDislikeListView = (TTDislikeListView) this.zp.findViewById(vDp.Oza);
        this.lMd = tTDislikeListView;
        tTDislikeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.4
            /* JADX WARN: Type inference failed for: r1v6, types: [android.widget.Adapter] */
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i9, long j7) {
                try {
                    FilterWord filterWord = (FilterWord) adapterView.getAdapter().getItem(i9);
                    if (filterWord.hasSecondOptions()) {
                        TTAdDislikeDialog.this.zp(filterWord);
                        if (TTAdDislikeDialog.this.YW != null) {
                            TTAdDislikeDialog.this.YW.zp(i9, filterWord);
                            return;
                        }
                        return;
                    }
                } catch (Throwable unused) {
                }
                if (TTAdDislikeDialog.this.YW != null) {
                    try {
                        TTAdDislikeDialog.this.YW.zp(i9, TTAdDislikeDialog.this.ku.sqt().get(i9));
                    } catch (Throwable unused2) {
                    }
                }
                TTAdDislikeDialog.this.lMd();
            }
        });
        TTDislikeListView tTDislikeListView2 = (TTDislikeListView) this.zp.findViewById(vDp.OJ);
        this.KS = tTDislikeListView2;
        tTDislikeListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.5
            /* JADX WARN: Type inference failed for: r1v1, types: [android.widget.Adapter] */
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i9, long j7) {
                if (TTAdDislikeDialog.this.YW != null) {
                    try {
                        TTAdDislikeDialog.this.YW.zp(i9, (FilterWord) adapterView.getAdapter().getItem(i9));
                    } catch (Throwable unused) {
                    }
                }
                TTAdDislikeDialog.this.lMd();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void HWF() {
        RelativeLayout relativeLayout = this.jU;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        View view = this.COT;
        if (view != null) {
            view.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView = this.lMd;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(0);
        }
        KS.lMd lmd = this.QR;
        if (lmd != null) {
            lmd.zp();
        }
        TTDislikeListView tTDislikeListView2 = this.KS;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(8);
        }
    }

    private COT.zp QR() {
        return new COT.zp() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.6
            @Override // com.bytedance.sdk.openadsdk.dislike.COT.zp
            public void KS() {
                TTAdDislikeDialog.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.COT.zp
            public void lMd() {
                TTAdDislikeDialog.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.COT.zp
            public void zp() {
                TTAdDislikeDialog.this.setVisibility(8);
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.COT.zp
            public void zp(int i9, FilterWord filterWord) {
                if (TTAdDislikeDialog.this.YW != null) {
                    TTAdDislikeDialog.this.YW.zp(i9, filterWord);
                    TTAdDislikeDialog.this.YW.lMd(TTAdDislikeDialog.this);
                }
            }
        };
    }

    private void jU() {
        if (this.ku == null) {
            return;
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        KS.lMd lmd = new KS.lMd(from, this.ku.sqt());
        this.HWF = lmd;
        this.lMd.setAdapter((ListAdapter) lmd);
        KS.lMd lmd2 = new KS.lMd(from, new ArrayList());
        this.QR = lmd2;
        lmd2.zp(false);
        this.KS.setAdapter((ListAdapter) this.QR);
        this.lMd.setMaterialMeta(this.ku.GP());
        this.KS.setMaterialMeta(this.ku.GP());
    }

    public void setCallback(zp zpVar) {
        this.YW = zpVar;
    }

    public void KS() {
        Context context = this.dT;
        if (context instanceof Activity) {
            boolean z8 = !((Activity) context).isFinishing();
            com.bytedance.sdk.openadsdk.dislike.COT cot = new com.bytedance.sdk.openadsdk.dislike.COT(this.dT);
            this.vDp = cot;
            cot.zp(QR());
            this.vDp.zp(this.ku.GP(), this.ku.Eg().toString());
            if (!z8 || this.vDp.isShowing()) {
                return;
            }
            this.vDp.show();
        }
    }

    public void lMd() {
        setVisibility(8);
        this.Bj = false;
        zp zpVar = this.YW;
        if (zpVar != null) {
            zpVar.lMd(this);
        }
    }

    private void zp(Context context, AttributeSet attributeSet) {
        setClickable(true);
        setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTAdDislikeDialog.this.lMd();
            }
        });
        setBackgroundColor(Color.parseColor("#80000000"));
        this.zp = new com.bytedance.sdk.openadsdk.dislike.jU().zp(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = WNy.lMd(getContext(), 20.0f);
        layoutParams.rightMargin = WNy.lMd(getContext(), 20.0f);
        this.zp.setLayoutParams(layoutParams);
        this.zp.setClickable(true);
        COT();
        jU();
    }

    public TTAdDislikeDialog(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public TTAdDislikeDialog(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeDialog(@NonNull Context context, @Nullable AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.Bj = false;
        zp(context, attributeSet);
    }

    public void zp() {
        if (this.zp.getParent() == null) {
            addView(this.zp);
        }
        HWF();
        setVisibility(0);
        this.Bj = true;
        zp zpVar = this.YW;
        if (zpVar != null) {
            zpVar.zp(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        KS.lMd lmd = this.QR;
        if (lmd != null) {
            lmd.zp(filterWord.getOptions());
        }
        RelativeLayout relativeLayout = this.jU;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        View view = this.COT;
        if (view != null) {
            view.setVisibility(0);
        }
        TTDislikeListView tTDislikeListView = this.lMd;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView2 = this.KS;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(0);
        }
    }
}
