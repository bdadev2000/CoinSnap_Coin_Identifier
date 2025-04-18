package androidx.compose.ui.text;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public abstract class LinkAnnotation {

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class Clickable extends LinkAnnotation {

        /* renamed from: a, reason: collision with root package name */
        public final String f16905a;

        /* renamed from: b, reason: collision with root package name */
        public final TextLinkStyles f16906b;

        /* renamed from: c, reason: collision with root package name */
        public final LinkInteractionListener f16907c = null;

        public Clickable(String str, TextLinkStyles textLinkStyles) {
            this.f16905a = str;
            this.f16906b = textLinkStyles;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        public final LinkInteractionListener a() {
            return this.f16907c;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        public final TextLinkStyles b() {
            return this.f16906b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Clickable)) {
                return false;
            }
            Clickable clickable = (Clickable) obj;
            if (!a.g(this.f16905a, clickable.f16905a)) {
                return false;
            }
            if (a.g(this.f16906b, clickable.f16906b)) {
                return a.g(this.f16907c, clickable.f16907c);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f16905a.hashCode() * 31;
            TextLinkStyles textLinkStyles = this.f16906b;
            int hashCode2 = (hashCode + (textLinkStyles != null ? textLinkStyles.hashCode() : 0)) * 31;
            LinkInteractionListener linkInteractionListener = this.f16907c;
            return hashCode2 + (linkInteractionListener != null ? linkInteractionListener.hashCode() : 0);
        }

        public final String toString() {
            return d.q(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f16905a, ')');
        }
    }

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class Url extends LinkAnnotation {

        /* renamed from: a, reason: collision with root package name */
        public final String f16908a;

        /* renamed from: b, reason: collision with root package name */
        public final TextLinkStyles f16909b;

        /* renamed from: c, reason: collision with root package name */
        public final LinkInteractionListener f16910c = null;

        public Url(String str, TextLinkStyles textLinkStyles) {
            this.f16908a = str;
            this.f16909b = textLinkStyles;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        public final LinkInteractionListener a() {
            return this.f16910c;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        public final TextLinkStyles b() {
            return this.f16909b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Url)) {
                return false;
            }
            Url url = (Url) obj;
            if (!a.g(this.f16908a, url.f16908a)) {
                return false;
            }
            if (a.g(this.f16909b, url.f16909b)) {
                return a.g(this.f16910c, url.f16910c);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f16908a.hashCode() * 31;
            TextLinkStyles textLinkStyles = this.f16909b;
            int hashCode2 = (hashCode + (textLinkStyles != null ? textLinkStyles.hashCode() : 0)) * 31;
            LinkInteractionListener linkInteractionListener = this.f16910c;
            return hashCode2 + (linkInteractionListener != null ? linkInteractionListener.hashCode() : 0);
        }

        public final String toString() {
            return d.q(new StringBuilder("LinkAnnotation.Url(url="), this.f16908a, ')');
        }
    }

    public abstract LinkInteractionListener a();

    public abstract TextLinkStyles b();
}
