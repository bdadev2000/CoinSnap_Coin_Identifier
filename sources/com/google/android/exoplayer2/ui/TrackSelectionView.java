package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import h.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k4.e0;
import k9.u;
import l9.v;
import l9.w;
import n9.q;
import s7.r0;
import s7.y2;
import v8.i1;

@Deprecated
/* loaded from: classes3.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public final int f11532b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f11533c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckedTextView f11534d;

    /* renamed from: f, reason: collision with root package name */
    public final CheckedTextView f11535f;

    /* renamed from: g, reason: collision with root package name */
    public final b f11536g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f11537h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f11538i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11539j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11540k;

    /* renamed from: l, reason: collision with root package name */
    public v f11541l;

    /* renamed from: m, reason: collision with root package name */
    public CheckedTextView[][] f11542m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11543n;

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f11532b = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.f11533c = from;
        b bVar = new b(this);
        this.f11536g = bVar;
        this.f11541l = new e0(getResources());
        this.f11537h = new ArrayList();
        this.f11538i = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f11534d = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.plantcare.ai.identifier.plantid.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(com.plantcare.ai.identifier.plantid.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f11535f = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.plantcare.ai.identifier.plantid.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }

    public final void a() {
        boolean z10;
        this.f11534d.setChecked(this.f11543n);
        boolean z11 = this.f11543n;
        HashMap hashMap = this.f11538i;
        if (!z11 && hashMap.size() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11535f.setChecked(z10);
        for (int i10 = 0; i10 < this.f11542m.length; i10++) {
            u uVar = (u) hashMap.get(((y2) this.f11537h.get(i10)).f24886c);
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f11542m[i10];
                if (i11 < checkedTextViewArr.length) {
                    if (uVar != null) {
                        Object tag = checkedTextViewArr[i11].getTag();
                        tag.getClass();
                        this.f11542m[i10][i11].setChecked(uVar.f20481c.contains(Integer.valueOf(((w) tag).f21278b)));
                    } else {
                        checkedTextViewArr[i11].setChecked(false);
                    }
                    i11++;
                }
            }
        }
    }

    public final void b() {
        char c10;
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        char c11;
        String b3;
        boolean z13;
        boolean z14;
        char c12;
        boolean z15 = true;
        int childCount = getChildCount() - 1;
        while (true) {
            c10 = 3;
            if (childCount < 3) {
                break;
            }
            removeViewAt(childCount);
            childCount--;
        }
        ArrayList arrayList = this.f11537h;
        boolean isEmpty = arrayList.isEmpty();
        boolean z16 = false;
        CheckedTextView checkedTextView = this.f11535f;
        CheckedTextView checkedTextView2 = this.f11534d;
        if (isEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.f11542m = new CheckedTextView[arrayList.size()];
        if (this.f11540k && arrayList.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = 0;
        boolean z17 = z10;
        while (i11 < arrayList.size()) {
            y2 y2Var = (y2) arrayList.get(i11);
            if (this.f11539j && y2Var.f24887d) {
                z11 = z15;
            } else {
                z11 = z16 ? 1 : 0;
            }
            CheckedTextView[][] checkedTextViewArr = this.f11542m;
            int i12 = y2Var.f24885b;
            checkedTextViewArr[i11] = new CheckedTextView[i12];
            w[] wVarArr = new w[i12];
            for (int i13 = z16 ? 1 : 0; i13 < y2Var.f24885b; i13++) {
                wVarArr[i13] = new w(y2Var, i13);
            }
            int i14 = z16 ? 1 : 0;
            boolean z18 = z17;
            while (i14 < i12) {
                LayoutInflater layoutInflater = this.f11533c;
                if (i14 == 0) {
                    addView(layoutInflater.inflate(com.plantcare.ai.identifier.plantid.R.layout.exo_list_divider, this, z16));
                }
                if (!z11 && !z18) {
                    i10 = R.layout.simple_list_item_single_choice;
                } else {
                    i10 = R.layout.simple_list_item_multiple_choice;
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate(i10, this, z16);
                checkedTextView3.setBackgroundResource(this.f11532b);
                v vVar = this.f11541l;
                w wVar = wVarArr[i14];
                r0 r0Var = wVar.a.f24886c.f26166f[wVar.f21278b];
                e0 e0Var = (e0) vVar;
                e0Var.getClass();
                int h10 = q.h(r0Var.f24723n);
                int i15 = r0Var.A;
                int i16 = r0Var.f24729t;
                ArrayList arrayList2 = arrayList;
                int i17 = r0Var.f24728s;
                if (h10 == -1) {
                    String str = r0Var.f24720k;
                    if (q.i(str) == null) {
                        if (q.b(str) == null) {
                            if (i17 == -1 && i16 == -1) {
                                if (i15 == -1 && r0Var.B == -1) {
                                    h10 = -1;
                                }
                            }
                        }
                        h10 = 1;
                    }
                    h10 = 2;
                }
                String str2 = "";
                Resources resources = e0Var.f20232b;
                boolean z19 = z18;
                if (h10 == 2) {
                    String[] strArr = new String[3];
                    strArr[0] = e0Var.d(r0Var);
                    if (i17 != -1 && i16 != -1) {
                        z12 = z11;
                        Integer valueOf = Integer.valueOf(i16);
                        c12 = 1;
                        str2 = resources.getString(com.plantcare.ai.identifier.plantid.R.string.exo_track_resolution, Integer.valueOf(i17), valueOf);
                    } else {
                        z12 = z11;
                        c12 = 1;
                    }
                    strArr[c12] = str2;
                    strArr[2] = e0Var.a(r0Var);
                    b3 = e0Var.e(strArr);
                    c11 = 3;
                } else {
                    z12 = z11;
                    if (h10 == 1) {
                        c11 = 3;
                        String[] strArr2 = new String[3];
                        strArr2[0] = e0Var.b(r0Var);
                        if (i15 != -1 && i15 >= 1) {
                            str2 = i15 != 1 ? i15 != 2 ? (i15 == 6 || i15 == 7) ? resources.getString(com.plantcare.ai.identifier.plantid.R.string.exo_track_surround_5_point_1) : i15 != 8 ? resources.getString(com.plantcare.ai.identifier.plantid.R.string.exo_track_surround) : resources.getString(com.plantcare.ai.identifier.plantid.R.string.exo_track_surround_7_point_1) : resources.getString(com.plantcare.ai.identifier.plantid.R.string.exo_track_stereo) : resources.getString(com.plantcare.ai.identifier.plantid.R.string.exo_track_mono);
                        }
                        strArr2[1] = str2;
                        strArr2[2] = e0Var.a(r0Var);
                        b3 = e0Var.e(strArr2);
                    } else {
                        c11 = 3;
                        b3 = e0Var.b(r0Var);
                    }
                }
                if (b3.length() == 0) {
                    b3 = resources.getString(com.plantcare.ai.identifier.plantid.R.string.exo_track_unknown);
                }
                checkedTextView3.setText(b3);
                checkedTextView3.setTag(wVarArr[i14]);
                if (y2Var.f24888f[i14] != 4) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z13) {
                    z15 = true;
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f11536g);
                    z14 = false;
                } else {
                    z15 = true;
                    z14 = false;
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.f11542m[i11][i14] = checkedTextView3;
                addView(checkedTextView3);
                i14++;
                z16 = z14;
                z18 = z19;
                z11 = z12;
                c10 = c11;
                arrayList = arrayList2;
            }
            boolean z20 = z16 ? 1 : 0;
            i11++;
            c10 = c10;
            arrayList = arrayList;
            z17 = z18;
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.f11543n;
    }

    public Map<i1, u> getOverrides() {
        return this.f11538i;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f11539j != z10) {
            this.f11539j = z10;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f11540k != z10) {
            this.f11540k = z10;
            if (!z10) {
                HashMap hashMap = this.f11538i;
                if (hashMap.size() > 1) {
                    ArrayList arrayList = this.f11537h;
                    HashMap hashMap2 = new HashMap();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        u uVar = (u) hashMap.get(((y2) arrayList.get(i10)).f24886c);
                        if (uVar != null && hashMap2.isEmpty()) {
                            hashMap2.put(uVar.f20480b, uVar);
                        }
                    }
                    hashMap.clear();
                    hashMap.putAll(hashMap2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f11534d.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(v vVar) {
        vVar.getClass();
        this.f11541l = vVar;
        b();
    }
}
