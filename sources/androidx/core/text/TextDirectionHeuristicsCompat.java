package androidx.core.text;

import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class TextDirectionHeuristicsCompat {

    /* renamed from: a, reason: collision with root package name */
    public static final TextDirectionHeuristicCompat f18670a = new TextDirectionHeuristicInternal(null, false);

    /* renamed from: b, reason: collision with root package name */
    public static final TextDirectionHeuristicCompat f18671b = new TextDirectionHeuristicInternal(null, true);

    /* renamed from: c, reason: collision with root package name */
    public static final TextDirectionHeuristicCompat f18672c;
    public static final TextDirectionHeuristicCompat d;

    /* loaded from: classes2.dex */
    public static class AnyStrong implements TextDirectionAlgorithm {
        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        public final int a(int i2, CharSequence charSequence) {
            int i3 = 0;
            boolean z2 = false;
            while (true) {
                char c2 = 2;
                if (i3 >= i2) {
                    return z2 ? 0 : 2;
                }
                byte directionality = Character.getDirectionality(charSequence.charAt(i3));
                TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.f18670a;
                if (directionality == 0) {
                    c2 = 1;
                } else if (directionality == 1 || directionality == 2) {
                    c2 = 0;
                }
                if (c2 == 0) {
                    z2 = true;
                } else if (c2 == 1) {
                    return 1;
                }
                i3++;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class FirstStrong implements TextDirectionAlgorithm {

        /* renamed from: a, reason: collision with root package name */
        public static final FirstStrong f18673a = new Object();

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        public final int a(int i2, CharSequence charSequence) {
            int i3 = 2;
            for (int i4 = 0; i4 < i2 && i3 == 2; i4++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i4));
                TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.f18670a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i3 = 2;
                                break;
                        }
                    }
                    i3 = 0;
                }
                i3 = 1;
            }
            return i3;
        }
    }

    /* loaded from: classes2.dex */
    public interface TextDirectionAlgorithm {
        int a(int i2, CharSequence charSequence);
    }

    /* loaded from: classes2.dex */
    public static abstract class TextDirectionHeuristicImpl implements TextDirectionHeuristicCompat {

        /* renamed from: a, reason: collision with root package name */
        public final TextDirectionAlgorithm f18674a;

        public TextDirectionHeuristicImpl(FirstStrong firstStrong) {
            this.f18674a = firstStrong;
        }

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public final boolean a(int i2, CharSequence charSequence) {
            if (charSequence == null || i2 < 0 || charSequence.length() - i2 < 0) {
                throw new IllegalArgumentException();
            }
            TextDirectionAlgorithm textDirectionAlgorithm = this.f18674a;
            if (textDirectionAlgorithm == null) {
                return b();
            }
            int a2 = textDirectionAlgorithm.a(i2, charSequence);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                return b();
            }
            return false;
        }

        public abstract boolean b();
    }

    /* loaded from: classes2.dex */
    public static class TextDirectionHeuristicInternal extends TextDirectionHeuristicImpl {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f18675b;

        public TextDirectionHeuristicInternal(FirstStrong firstStrong, boolean z2) {
            super(firstStrong);
            this.f18675b = z2;
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        public final boolean b() {
            return this.f18675b;
        }
    }

    /* loaded from: classes2.dex */
    public static class TextDirectionHeuristicLocale extends TextDirectionHeuristicImpl {
        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        public final boolean b() {
            return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        }
    }

    static {
        FirstStrong firstStrong = FirstStrong.f18673a;
        f18672c = new TextDirectionHeuristicInternal(firstStrong, false);
        d = new TextDirectionHeuristicInternal(firstStrong, true);
    }
}
