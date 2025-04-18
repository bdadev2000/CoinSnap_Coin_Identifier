package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import e0.f;
import java.util.List;
import r0.a;

/* loaded from: classes.dex */
public interface ImmutableList<E> extends List<E>, ImmutableCollection<E>, a {

    /* loaded from: classes.dex */
    public static final class SubList<E> extends f implements ImmutableList<E> {

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableList f14162a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14163b;

        /* renamed from: c, reason: collision with root package name */
        public final int f14164c;

        public SubList(ImmutableList immutableList, int i2, int i3) {
            this.f14162a = immutableList;
            this.f14163b = i2;
            ListImplementation.c(i2, i3, immutableList.size());
            this.f14164c = i3 - i2;
        }

        @Override // java.util.List
        public final Object get(int i2) {
            ListImplementation.a(i2, this.f14164c);
            return this.f14162a.get(this.f14163b + i2);
        }

        @Override // e0.a
        public final int getSize() {
            return this.f14164c;
        }

        @Override // e0.f, java.util.List
        public final List subList(int i2, int i3) {
            ListImplementation.c(i2, i3, this.f14164c);
            int i4 = this.f14163b;
            return new SubList(this.f14162a, i2 + i4, i4 + i3);
        }
    }

    @Override // java.util.List
    default ImmutableList subList(int i2, int i3) {
        return new SubList(this, i2, i3);
    }
}
