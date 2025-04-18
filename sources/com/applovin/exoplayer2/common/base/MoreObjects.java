package com.applovin.exoplayer2.common.base;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.objectweb.asm.signature.SignatureVisitor;

/* loaded from: classes2.dex */
public final class MoreObjects {

    /* loaded from: classes2.dex */
    public static final class ToStringHelper {
        private final String className;
        private final a holderHead;
        private a holderTail;
        private boolean omitNullValues;

        /* loaded from: classes2.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            String f22479a;

            /* renamed from: b, reason: collision with root package name */
            Object f22480b;

            /* renamed from: c, reason: collision with root package name */
            a f22481c;

            private a() {
            }
        }

        private a addHolder() {
            a aVar = new a();
            this.holderTail.f22481c = aVar;
            this.holderTail = aVar;
            return aVar;
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, @NullableDecl Object obj) {
            return addHolder(str, obj);
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(@NullableDecl Object obj) {
            return addHolder(obj);
        }

        @CanIgnoreReturnValue
        public ToStringHelper omitNullValues() {
            this.omitNullValues = true;
            return this;
        }

        public String toString() {
            boolean z2 = this.omitNullValues;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.className);
            sb.append('{');
            String str = "";
            for (a aVar = this.holderHead.f22481c; aVar != null; aVar = aVar.f22481c) {
                Object obj = aVar.f22480b;
                if (!z2 || obj != null) {
                    sb.append(str);
                    String str2 = aVar.f22479a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append(SignatureVisitor.INSTANCEOF);
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private ToStringHelper(String str) {
            a aVar = new a();
            this.holderHead = aVar;
            this.holderTail = aVar;
            this.omitNullValues = false;
            this.className = (String) Preconditions.checkNotNull(str);
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, boolean z2) {
            return addHolder(str, String.valueOf(z2));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(boolean z2) {
            return addHolder(String.valueOf(z2));
        }

        private ToStringHelper addHolder(@NullableDecl Object obj) {
            addHolder().f22480b = obj;
            return this;
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, char c2) {
            return addHolder(str, String.valueOf(c2));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(char c2) {
            return addHolder(String.valueOf(c2));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, double d) {
            return addHolder(str, String.valueOf(d));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(double d) {
            return addHolder(String.valueOf(d));
        }

        private ToStringHelper addHolder(String str, @NullableDecl Object obj) {
            a addHolder = addHolder();
            addHolder.f22480b = obj;
            addHolder.f22479a = (String) Preconditions.checkNotNull(str);
            return this;
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, float f2) {
            return addHolder(str, String.valueOf(f2));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(float f2) {
            return addHolder(String.valueOf(f2));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, int i2) {
            return addHolder(str, String.valueOf(i2));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(int i2) {
            return addHolder(String.valueOf(i2));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, long j2) {
            return addHolder(str, String.valueOf(j2));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(long j2) {
            return addHolder(String.valueOf(j2));
        }
    }

    private MoreObjects() {
    }

    public static <T> T firstNonNull(@NullableDecl T t2, @NullableDecl T t3) {
        if (t2 != null) {
            return t2;
        }
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj.getClass().getSimpleName());
    }

    public static ToStringHelper toStringHelper(Class<?> cls) {
        return new ToStringHelper(cls.getSimpleName());
    }

    public static ToStringHelper toStringHelper(String str) {
        return new ToStringHelper(str);
    }
}
