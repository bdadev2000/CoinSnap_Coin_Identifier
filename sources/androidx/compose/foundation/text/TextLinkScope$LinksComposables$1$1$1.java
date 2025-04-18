package androidx.compose.foundation.text;

import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TextLinkScope$LinksComposables$1$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextLinkScope f6218a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnnotatedString.Range f6219b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UriHandler f6220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextLinkScope$LinksComposables$1$1$1(TextLinkScope textLinkScope, AnnotatedString.Range range, UriHandler uriHandler) {
        super(0);
        this.f6218a = textLinkScope;
        this.f6219b = range;
        this.f6220c = uriHandler;
    }

    @Override // q0.a
    public final Object invoke() {
        LinkInteractionListener a2;
        b0 b0Var;
        LinkAnnotation linkAnnotation = (LinkAnnotation) this.f6219b.f16890a;
        UriHandler uriHandler = this.f6220c;
        this.f6218a.getClass();
        boolean z2 = linkAnnotation instanceof LinkAnnotation.Url;
        b0 b0Var2 = b0.f30125a;
        if (z2) {
            LinkInteractionListener a3 = linkAnnotation.a();
            if (a3 != null) {
                a3.a();
                b0Var = b0Var2;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                try {
                    uriHandler.a(((LinkAnnotation.Url) linkAnnotation).f16908a);
                } catch (IllegalArgumentException unused) {
                }
            }
        } else if ((linkAnnotation instanceof LinkAnnotation.Clickable) && (a2 = linkAnnotation.a()) != null) {
            a2.a();
        }
        return b0Var2;
    }
}
