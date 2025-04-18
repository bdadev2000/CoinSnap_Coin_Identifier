package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import g.a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: b, reason: collision with root package name */
    public final int f631b;

    /* renamed from: c, reason: collision with root package name */
    public final int f632c;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f17897t);
        this.f632c = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f631b = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
