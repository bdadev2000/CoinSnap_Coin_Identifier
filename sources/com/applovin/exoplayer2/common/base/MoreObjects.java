package com.applovin.exoplayer2.common.base;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class MoreObjects {

    /* loaded from: classes.dex */
    public static final class ToStringHelper {
        private final String className;
        private final a holderHead;
        private a holderTail;
        private boolean omitNullValues;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            String f6136a;
            Object b;

            /* renamed from: c, reason: collision with root package name */
            a f6137c;

            private a() {
            }
        }

        private a addHolder() {
            a aVar = new a();
            this.holderTail.f6137c = aVar;
            this.holderTail = aVar;
            return aVar;
        }

        public ToStringHelper add(String str, @NullableDecl Object obj) {
            return addHolder(str, obj);
        }

        public ToStringHelper addValue(@NullableDecl Object obj) {
            return addHolder(obj);
        }

        public ToStringHelper omitNullValues() {
            this.omitNullValues = true;
            return this;
        }

        public String toString() {
            boolean z8 = this.omitNullValues;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.className);
            sb.append('{');
            String str = "";
            for (a aVar = this.holderHead.f6137c; aVar != null; aVar = aVar.f6137c) {
                Object obj = aVar.b;
                if (!z8 || obj != null) {
                    sb.append(str);
                    String str2 = aVar.f6136a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb.append(obj);
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

        public ToStringHelper add(String str, boolean z8) {
            return addHolder(str, String.valueOf(z8));
        }

        public ToStringHelper addValue(boolean z8) {
            return addHolder(String.valueOf(z8));
        }

        private ToStringHelper addHolder(@NullableDecl Object obj) {
            addHolder().b = obj;
            return this;
        }

        public ToStringHelper add(String str, char c9) {
            return addHolder(str, String.valueOf(c9));
        }

        public ToStringHelper addValue(char c9) {
            return addHolder(String.valueOf(c9));
        }

        public ToStringHelper add(String str, double d2) {
            return addHolder(str, String.valueOf(d2));
        }

        public ToStringHelper addValue(double d2) {
            return addHolder(String.valueOf(d2));
        }

        private ToStringHelper addHolder(String str, @NullableDecl Object obj) {
            a addHolder = addHolder();
            addHolder.b = obj;
            addHolder.f6136a = (String) Preconditions.checkNotNull(str);
            return this;
        }

        public ToStringHelper add(String str, float f9) {
            return addHolder(str, String.valueOf(f9));
        }

        public ToStringHelper addValue(float f9) {
            return addHolder(String.valueOf(f9));
        }

        public ToStringHelper add(String str, int i9) {
            return addHolder(str, String.valueOf(i9));
        }

        public ToStringHelper addValue(int i9) {
            return addHolder(String.valueOf(i9));
        }

        public ToStringHelper add(String str, long j7) {
            return addHolder(str, String.valueOf(j7));
        }

        public ToStringHelper addValue(long j7) {
            return addHolder(String.valueOf(j7));
        }
    }

    private MoreObjects() {
    }

    public static <T> T firstNonNull(@NullableDecl T t9, @NullableDecl T t10) {
        if (t9 != null) {
            return t9;
        }
        if (t10 != null) {
            return t10;
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
