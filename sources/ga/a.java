package ga;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.f0;
import com.bumptech.glide.d;
import t0.b;
import v8.u0;

/* loaded from: classes3.dex */
public final class a extends f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final int[][] f18374i = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f18375g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18376h;

    public a(Context context, AttributeSet attributeSet) {
        super(p6.a.z(context, attributeSet, com.plantcare.ai.identifier.plantid.R.attr.radioButtonStyle, com.plantcare.ai.identifier.plantid.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray s5 = d.s(context2, attributeSet, r9.a.f24033o, com.plantcare.ai.identifier.plantid.R.attr.radioButtonStyle, com.plantcare.ai.identifier.plantid.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (s5.hasValue(0)) {
            b.c(this, u0.z(context2, s5, 0));
        }
        this.f18376h = s5.getBoolean(1, false);
        s5.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f18375g == null) {
            int x10 = u0.x(com.plantcare.ai.identifier.plantid.R.attr.colorControlActivated, this);
            int x11 = u0.x(com.plantcare.ai.identifier.plantid.R.attr.colorOnSurface, this);
            int x12 = u0.x(com.plantcare.ai.identifier.plantid.R.attr.colorSurface, this);
            this.f18375g = new ColorStateList(f18374i, new int[]{u0.O(1.0f, x12, x10), u0.O(0.54f, x12, x11), u0.O(0.38f, x12, x11), u0.O(0.38f, x12, x11)});
        }
        return this.f18375g;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f18376h && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f18376h = z10;
        if (z10) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
