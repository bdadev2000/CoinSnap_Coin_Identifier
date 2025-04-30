package j0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC0505o;
import androidx.lifecycle.InterfaceC0495e;
import androidx.lifecycle.InterfaceC0511v;

/* loaded from: classes.dex */
public final class k implements InterfaceC0495e {
    public final /* synthetic */ AbstractC0505o b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer f20980c;

    public k(EmojiCompatInitializer emojiCompatInitializer, AbstractC0505o abstractC0505o) {
        this.f20980c = emojiCompatInitializer;
        this.b = abstractC0505o;
    }

    @Override // androidx.lifecycle.InterfaceC0495e
    public final void a(InterfaceC0511v interfaceC0511v) {
        Handler handler;
        this.f20980c.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            handler = AbstractC2381b.a(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new V5.a(4), 500L);
        this.b.b(this);
    }
}
