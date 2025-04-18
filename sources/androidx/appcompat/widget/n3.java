package androidx.appcompat.widget;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class n3 {
    public final TextView a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f959b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f960c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f961d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f962e;

    public n3(View view) {
        this.a = (TextView) view.findViewById(R.id.text1);
        this.f959b = (TextView) view.findViewById(R.id.text2);
        this.f960c = (ImageView) view.findViewById(R.id.icon1);
        this.f961d = (ImageView) view.findViewById(R.id.icon2);
        this.f962e = (ImageView) view.findViewById(com.plantcare.ai.identifier.plantid.R.id.edit_query);
    }
}
