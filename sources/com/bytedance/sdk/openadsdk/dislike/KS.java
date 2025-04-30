package com.bytedance.sdk.openadsdk.dislike;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.settings.dQp;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.ku;
import com.bytedance.sdk.openadsdk.utils.vDp;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class KS extends TTDislikeDialogAbstract {
    private lMd COT;
    private lMd HWF;
    private RelativeLayout KS;
    private zp QR;
    private String YW;
    private List<FilterWord> dT;
    private View jU;
    private String ku;
    private TTDislikeListView lMd;
    private TTDislikeListView zp;

    /* loaded from: classes.dex */
    public static class lMd extends BaseAdapter {
        private final LayoutInflater KS;
        private final List<FilterWord> lMd;
        private boolean zp = true;

        /* loaded from: classes.dex */
        public static class zp {
            ImageView lMd;
            TextView zp;

            private zp() {
            }
        }

        public lMd(LayoutInflater layoutInflater, List<FilterWord> list) {
            this.lMd = list;
            this.KS = layoutInflater;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<FilterWord> list = this.lMd;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i9) {
            return this.lMd.get(i9);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i9) {
            return i9;
        }

        @Override // android.widget.Adapter
        public View getView(int i9, View view, ViewGroup viewGroup) {
            View view2;
            zp zpVar;
            if (view == null) {
                zpVar = new zp();
                view2 = zp(this.KS.getContext());
                zpVar.zp = (TextView) view2.findViewById(vDp.cdp);
                zpVar.lMd = (ImageView) view2.findViewById(vDp.hG);
                view2.setTag(zpVar);
            } else {
                view2 = view;
                zpVar = (zp) view.getTag();
            }
            FilterWord filterWord = this.lMd.get(i9);
            zpVar.zp.setText(filterWord.getName());
            if (dQp.etV().gH()) {
                zpVar.zp.setBackground(ku.zp(this.KS.getContext(), "tt_dislike_middle_seletor"));
            } else if (i9 != this.lMd.size() - 1) {
                zpVar.zp.setBackground(ku.zp(this.KS.getContext(), "tt_dislike_middle_seletor"));
            } else {
                zpVar.zp.setBackground(ku.zp(this.KS.getContext(), "tt_dislike_bottom_seletor"));
            }
            if (this.zp && i9 == 0) {
                zpVar.zp.setBackground(ku.zp(this.KS.getContext(), "tt_dislike_top_seletor"));
            }
            if (filterWord.hasSecondOptions()) {
                zpVar.lMd.setVisibility(0);
            } else {
                zpVar.lMd.setVisibility(8);
            }
            return view2;
        }

        public void zp(boolean z8) {
            this.zp = z8;
        }

        private View zp(Context context) {
            PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
            pAGFrameLayout.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
            PAGTextView pAGTextView = new PAGTextView(context);
            pAGTextView.setId(vDp.cdp);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, WNy.lMd(context, 44.0f));
            layoutParams.gravity = 17;
            pAGTextView.setLayoutParams(layoutParams);
            pAGTextView.setGravity(17);
            pAGTextView.setTextColor(Color.parseColor("#FF4A4A4A"));
            pAGTextView.setTextSize(16.0f);
            PAGImageView pAGImageView = new PAGImageView(context);
            pAGImageView.setId(vDp.hG);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(WNy.lMd(context, 44.0f), WNy.lMd(context, 44.0f));
            layoutParams2.gravity = 8388629;
            pAGImageView.setLayoutParams(layoutParams2);
            pAGImageView.setRotation(180.0f);
            pAGImageView.setScaleType(ImageView.ScaleType.CENTER);
            pAGImageView.setImageDrawable(ku.zp(context, "tt_lefterbackicon_titlebar_press_wrapper"));
            pAGFrameLayout.addView(pAGTextView);
            pAGFrameLayout.addView(pAGImageView);
            return pAGFrameLayout;
        }

        public void zp(List<FilterWord> list) {
            if (list == null || list.isEmpty()) {
                return;
            }
            this.lMd.clear();
            this.lMd.addAll(list);
            notifyDataSetChanged();
        }

        public void zp() {
            this.lMd.clear();
            notifyDataSetChanged();
        }
    }

    /* loaded from: classes.dex */
    public interface zp {
        void KS();

        void lMd();

        void zp();

        void zp(int i9, FilterWord filterWord);
    }

    public KS(Context context, String str, List<FilterWord> list) {
        super(context, cz.HWF(context, "tt_dislikeDialog"));
        this.YW = str;
        this.dT = list;
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(WNy.KS(getContext()) - 120, -2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public View getLayoutView() {
        return new jU().zp(getContext());
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public int[] getTTDislikeListViewIds() {
        return new int[]{vDp.Oza, vDp.OJ};
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract, android.app.Dialog
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            setCanceledOnTouchOutside(true);
            setCancelable(true);
            zp();
            zp(getContext());
            lMd();
            setMaterialMeta(this.YW, this.dT);
        } catch (Throwable unused) {
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
            KS();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void KS() {
        RelativeLayout relativeLayout = this.KS;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        View view = this.jU;
        if (view != null) {
            view.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView = this.zp;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(0);
        }
        lMd lmd = this.HWF;
        if (lmd != null) {
            lmd.zp();
        }
        TTDislikeListView tTDislikeListView2 = this.lMd;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(8);
        }
    }

    private void lMd() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.bytedance.sdk.openadsdk.dislike.KS.1
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                if (KS.this.QR != null) {
                    zp unused = KS.this.QR;
                }
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.bytedance.sdk.openadsdk.dislike.KS.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (KS.this.QR != null) {
                    KS.this.QR.lMd();
                }
            }
        });
        lMd lmd = new lMd(getLayoutInflater(), this.dT);
        this.COT = lmd;
        this.zp.setAdapter((ListAdapter) lmd);
        lMd lmd2 = new lMd(getLayoutInflater(), new ArrayList());
        this.HWF = lmd2;
        lmd2.zp(false);
        this.lMd.setAdapter((ListAdapter) this.HWF);
    }

    public void zp(String str, List<FilterWord> list) {
        lMd lmd = this.COT;
        if (lmd == null || this.dT == null || str == null) {
            return;
        }
        this.YW = str;
        this.dT = list;
        lmd.zp(list);
        setMaterialMeta(str, list);
    }

    public void zp(zp zpVar) {
        this.QR = zpVar;
    }

    public void zp(String str) {
        this.ku = str;
    }

    private void zp() {
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.y = 50;
            window.setAttributes(attributes);
        }
    }

    private void zp(Context context) {
        this.KS = (RelativeLayout) findViewById(vDp.ITK);
        this.jU = findViewById(vDp.vFs);
        TextView textView = (TextView) findViewById(vDp.JR);
        TextView textView2 = (TextView) findViewById(vDp.gKR);
        PAGTextView pAGTextView = (PAGTextView) findViewById(vDp.VgU);
        textView.setText(cz.zp(getContext(), "tt_dislike_header_tv_back"));
        textView2.setText(cz.zp(getContext(), "tt_dislike_header_tv_title"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.KS.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                KS.this.KS();
                if (KS.this.QR != null) {
                    KS.this.QR.KS();
                }
            }
        });
        if (pAGTextView != null) {
            pAGTextView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.KS.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    KS.this.QR.zp();
                }
            });
        }
        TTDislikeListView tTDislikeListView = (TTDislikeListView) findViewById(vDp.Oza);
        this.zp = tTDislikeListView;
        tTDislikeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.KS.5
            /* JADX WARN: Type inference failed for: r1v6, types: [android.widget.Adapter] */
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i9, long j7) {
                try {
                    FilterWord filterWord = (FilterWord) adapterView.getAdapter().getItem(i9);
                    if (filterWord.hasSecondOptions()) {
                        KS.this.zp(filterWord);
                        if (KS.this.QR != null) {
                            KS.this.QR.zp(i9, filterWord);
                            return;
                        }
                        return;
                    }
                } catch (Throwable unused) {
                }
                if (KS.this.QR != null) {
                    try {
                        KS.this.QR.zp(i9, (FilterWord) KS.this.dT.get(i9));
                    } catch (Throwable unused2) {
                    }
                }
                KS.this.dismiss();
            }
        });
        this.zp.setClosedListenerKey(this.ku);
        TTDislikeListView tTDislikeListView2 = (TTDislikeListView) findViewById(vDp.OJ);
        this.lMd = tTDislikeListView2;
        tTDislikeListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.KS.6
            /* JADX WARN: Type inference failed for: r1v1, types: [android.widget.Adapter] */
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i9, long j7) {
                if (KS.this.QR != null) {
                    try {
                        KS.this.QR.zp(i9, (FilterWord) adapterView.getAdapter().getItem(i9));
                    } catch (Throwable unused) {
                    }
                }
                KS.this.dismiss();
            }
        });
        this.lMd.setClosedListenerKey(this.ku);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        lMd lmd = this.HWF;
        if (lmd != null) {
            lmd.zp(filterWord.getOptions());
        }
        RelativeLayout relativeLayout = this.KS;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        View view = this.jU;
        if (view != null) {
            view.setVisibility(0);
        }
        TTDislikeListView tTDislikeListView = this.zp;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView2 = this.lMd;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(0);
        }
    }
}
