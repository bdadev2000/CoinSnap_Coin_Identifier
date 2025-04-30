package z1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f24496d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f24497a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f24498c;

    public a(Drawable.Callback callback, String str, Map map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.b = str.concat("/");
        } else {
            this.b = str;
        }
        this.f24498c = map;
        if (!(callback instanceof View)) {
            this.f24497a = null;
        } else {
            this.f24497a = ((View) callback).getContext().getApplicationContext();
        }
    }
}
