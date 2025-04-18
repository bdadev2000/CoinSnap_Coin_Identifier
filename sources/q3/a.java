package q3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f23680d = new Object();
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23681b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f23682c;

    public a(Drawable.Callback callback, String str, Map map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f23681b = str.concat("/");
        } else {
            this.f23681b = str;
        }
        this.f23682c = map;
        if (!(callback instanceof View)) {
            this.a = null;
        } else {
            this.a = ((View) callback).getContext().getApplicationContext();
        }
    }
}
