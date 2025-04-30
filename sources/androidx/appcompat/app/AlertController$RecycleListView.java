package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import j.AbstractC2379a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4118c;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2379a.f20958t);
        this.f4118c = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.b = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
