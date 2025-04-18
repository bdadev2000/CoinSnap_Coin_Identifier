package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.ReceiveContentNode;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes2.dex */
public final class DynamicReceiveContentConfiguration extends ReceiveContentConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final ReceiveContentNode f2895a;

    /* renamed from: b, reason: collision with root package name */
    public final DynamicReceiveContentConfiguration$receiveContentListener$1 f2896b = new ReceiveContentListener() { // from class: androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration$receiveContentListener$1

        /* renamed from: a, reason: collision with root package name */
        public int f2897a;

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public final void a() {
            int i2 = this.f2897a + 1;
            this.f2897a = i2;
            DynamicReceiveContentConfiguration dynamicReceiveContentConfiguration = DynamicReceiveContentConfiguration.this;
            if (i2 == 1) {
                dynamicReceiveContentConfiguration.f2895a.f2891q.a();
            }
            ReceiveContentConfiguration a2 = ReceiveContentConfigurationKt.a(dynamicReceiveContentConfiguration.f2895a);
            ReceiveContentListener a3 = a2 != null ? a2.a() : null;
            if (a3 != null) {
                a3.a();
            }
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public final void b() {
            DynamicReceiveContentConfiguration.this.f2895a.f2891q.b();
            this.f2897a = 0;
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public final void c() {
            this.f2897a = 0;
            DynamicReceiveContentConfiguration.this.f2895a.f2891q.c();
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public final void d() {
            int i2 = this.f2897a;
            int i3 = i2 - 1;
            if (i3 < 0) {
                i3 = 0;
            }
            this.f2897a = i3;
            DynamicReceiveContentConfiguration dynamicReceiveContentConfiguration = DynamicReceiveContentConfiguration.this;
            if (i3 == 0 && i2 > 0) {
                dynamicReceiveContentConfiguration.f2895a.f2891q.d();
            }
            ReceiveContentConfiguration a2 = ReceiveContentConfigurationKt.a(dynamicReceiveContentConfiguration.f2895a);
            ReceiveContentListener a3 = a2 != null ? a2.a() : null;
            if (a3 != null) {
                a3.d();
            }
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public final TransferableContent e(TransferableContent transferableContent) {
            DynamicReceiveContentConfiguration dynamicReceiveContentConfiguration = DynamicReceiveContentConfiguration.this;
            TransferableContent e = dynamicReceiveContentConfiguration.f2895a.f2891q.e(transferableContent);
            if (e == null) {
                return null;
            }
            ReceiveContentConfiguration a2 = ReceiveContentConfigurationKt.a(dynamicReceiveContentConfiguration.f2895a);
            ReceiveContentListener a3 = a2 != null ? a2.a() : null;
            return a3 == null ? e : a3.e(e);
        }
    };

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration$receiveContentListener$1] */
    public DynamicReceiveContentConfiguration(ReceiveContentNode receiveContentNode) {
        this.f2895a = receiveContentNode;
    }

    @Override // androidx.compose.foundation.content.internal.ReceiveContentConfiguration
    public final ReceiveContentListener a() {
        return this.f2896b;
    }
}
