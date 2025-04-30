package A6;

import F7.l;
import G7.j;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.J;
import androidx.recyclerview.widget.p0;
import com.bumptech.glide.m;
import com.core.ar.model.Tool;
import com.tools.arruler.photomeasure.camera.ruler.R;
import d0.AbstractC2155b;
import j2.g;
import java.util.ArrayList;
import u6.i0;
import u6.k0;
import u7.AbstractC2816g;

/* loaded from: classes3.dex */
public final class b extends J {

    /* renamed from: j, reason: collision with root package name */
    public final l f78j;
    public int l;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77i = 0;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f79k = new ArrayList();

    public b(z6.b bVar, byte b) {
        this.f78j = bVar;
    }

    @Override // androidx.recyclerview.widget.J
    public final int getItemCount() {
        switch (this.f77i) {
            case 0:
                return this.f79k.size();
            default:
                return this.f79k.size();
        }
    }

    @Override // androidx.recyclerview.widget.J
    public final void onBindViewHolder(p0 p0Var, int i9) {
        int i10;
        boolean z8;
        switch (this.f77i) {
            case 0:
                a aVar = (a) p0Var;
                j.e(aVar, "holder");
                Tool tool = (Tool) AbstractC2816g.L(i9, this.f79k);
                if (tool != null) {
                    boolean isPremium = tool.isPremium();
                    int i11 = 0;
                    i0 i0Var = aVar.b;
                    if (!isPremium) {
                        AppCompatImageView appCompatImageView = i0Var.f23329s;
                        j.d(appCompatImageView, "imvPremium");
                        appCompatImageView.setVisibility(0);
                    }
                    AppCompatImageView appCompatImageView2 = i0Var.f23328r;
                    Context context = appCompatImageView2.getContext();
                    g.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
                    com.bumptech.glide.b.a(context).f12794g.c(context).j(Integer.valueOf(tool.getThumbId())).w(appCompatImageView2);
                    i0Var.f23330t.setText(tool.getName());
                    AppCompatImageView appCompatImageView3 = i0Var.f23327q;
                    Context context2 = appCompatImageView3.getContext();
                    g.c(context2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
                    m c9 = com.bumptech.glide.b.a(context2).f12794g.c(context2);
                    b bVar = aVar.f76c;
                    if (bVar.l == i9) {
                        i10 = R.drawable.radio_checked;
                    } else {
                        i10 = R.drawable.radio_unchecked;
                    }
                    c9.j(Integer.valueOf(i10)).w(appCompatImageView3);
                    View view = i0Var.f23331u;
                    j.d(view, "viewLine");
                    if (i9 == bVar.f79k.size() - 1) {
                        i11 = 8;
                    }
                    view.setVisibility(i11);
                    i0Var.f19787f.setOnClickListener(new L6.a(tool, bVar, i9));
                    return;
                }
                return;
            default:
                final e eVar = (e) p0Var;
                j.e(eVar, "holder");
                final t2.a aVar2 = (t2.a) this.f79k.get(i9);
                j.e(aVar2, "item");
                k0 k0Var = eVar.b;
                k0Var.f19787f.setOnClickListener(new c(eVar, 0));
                k0Var.f23349r.setText("( " + aVar2.b + " ) " + aVar2.f23005c);
                final b bVar2 = eVar.f83c;
                if (bVar2.l == eVar.getAbsoluteAdapterPosition()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                RadioButton radioButton = k0Var.f23348q;
                radioButton.setChecked(z8);
                radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: A6.d
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                        b bVar3 = b.this;
                        j.e(bVar3, "this$0");
                        e eVar2 = eVar;
                        j.e(eVar2, "this$1");
                        t2.a aVar3 = aVar2;
                        j.e(aVar3, "$item");
                        if (z9) {
                            int i12 = bVar3.l;
                            bVar3.l = eVar2.getAbsoluteAdapterPosition();
                            bVar3.notifyItemChanged(i12);
                            bVar3.f78j.invoke(aVar3);
                        }
                    }
                });
                return;
        }
    }

    @Override // androidx.recyclerview.widget.J
    public final p0 onCreateViewHolder(ViewGroup viewGroup, int i9) {
        switch (this.f77i) {
            case 0:
                j.e(viewGroup, "parent");
                LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
                int i10 = i0.f23326v;
                i0 i0Var = (i0) AbstractC2155b.b(R.layout.item_tool, from, viewGroup);
                j.d(i0Var, "inflate(...)");
                return new a(this, i0Var);
            default:
                j.e(viewGroup, "parent");
                LayoutInflater from2 = LayoutInflater.from(viewGroup.getContext());
                int i11 = k0.f23347t;
                k0 k0Var = (k0) AbstractC2155b.b(R.layout.item_unit, from2, viewGroup);
                j.d(k0Var, "inflate(...)");
                return new e(this, k0Var);
        }
    }

    public b(z6.b bVar) {
        this.f78j = bVar;
    }
}
