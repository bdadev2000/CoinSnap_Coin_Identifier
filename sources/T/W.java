package T;

import android.view.ContentInfo;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import j5.C2400c;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class W {
    @Nullable
    public static String[] a(@NonNull View view) {
        return view.getReceiveContentMimeTypes();
    }

    @Nullable
    public static C0268f b(@NonNull View view, @NonNull C0268f c0268f) {
        ContentInfo g9 = c0268f.f2885a.g();
        Objects.requireNonNull(g9);
        ContentInfo n2 = B3.a.n(g9);
        ContentInfo performReceiveContent = view.performReceiveContent(n2);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == n2) {
            return c0268f;
        }
        return new C0268f(new C2400c(performReceiveContent));
    }

    public static void c(@NonNull View view, @Nullable String[] strArr, @Nullable InterfaceC0293y interfaceC0293y) {
        if (interfaceC0293y == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new X(interfaceC0293y));
        }
    }
}
