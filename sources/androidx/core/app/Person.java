package androidx.core.app;

import android.app.Person;
import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.share.internal.ShareConstants;
import java.util.Objects;

/* loaded from: classes3.dex */
public class Person {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f18455a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f18456b;

    /* renamed from: c, reason: collision with root package name */
    public String f18457c;
    public String d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18458f;

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class Api22Impl {
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.app.Person$Builder, java.lang.Object] */
        @DoNotInline
        public static Person a(PersistableBundle persistableBundle) {
            ?? obj = new Object();
            obj.f18459a = persistableBundle.getString("name");
            obj.f18461c = persistableBundle.getString(ShareConstants.MEDIA_URI);
            obj.d = persistableBundle.getString(SDKConstants.PARAM_KEY);
            obj.e = persistableBundle.getBoolean("isBot");
            obj.f18462f = persistableBundle.getBoolean("isImportant");
            return obj.a();
        }

        @DoNotInline
        public static PersistableBundle b(Person person) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = person.f18455a;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString(ShareConstants.MEDIA_URI, person.f18457c);
            persistableBundle.putString(SDKConstants.PARAM_KEY, person.d);
            persistableBundle.putBoolean("isBot", person.e);
            persistableBundle.putBoolean("isImportant", person.f18458f);
            return persistableBundle;
        }
    }

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class Api28Impl {
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.app.Person$Builder, java.lang.Object] */
        @DoNotInline
        public static Person a(android.app.Person person) {
            ?? obj = new Object();
            obj.f18459a = person.getName();
            obj.f18460b = person.getIcon() != null ? IconCompat.a(person.getIcon()) : null;
            obj.f18461c = person.getUri();
            obj.d = person.getKey();
            obj.e = person.isBot();
            obj.f18462f = person.isImportant();
            return obj.a();
        }

        @DoNotInline
        public static android.app.Person b(Person person) {
            Person.Builder name = new Person.Builder().setName(person.f18455a);
            IconCompat iconCompat = person.f18456b;
            return name.setIcon(iconCompat != null ? iconCompat.h() : null).setUri(person.f18457c).setKey(person.d).setBot(person.e).setImportant(person.f18458f).build();
        }
    }

    /* loaded from: classes3.dex */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public CharSequence f18459a;

        /* renamed from: b, reason: collision with root package name */
        public IconCompat f18460b;

        /* renamed from: c, reason: collision with root package name */
        public String f18461c;
        public String d;
        public boolean e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f18462f;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.app.Person, java.lang.Object] */
        public final Person a() {
            ?? obj = new Object();
            obj.f18455a = this.f18459a;
            obj.f18456b = this.f18460b;
            obj.f18457c = this.f18461c;
            obj.d = this.d;
            obj.e = this.e;
            obj.f18458f = this.f18462f;
            return obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        String str = this.d;
        String str2 = person.d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(this.f18455a), Objects.toString(person.f18455a)) && Objects.equals(this.f18457c, person.f18457c) && Objects.equals(Boolean.valueOf(this.e), Boolean.valueOf(person.e)) && Objects.equals(Boolean.valueOf(this.f18458f), Boolean.valueOf(person.f18458f)) : Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(this.f18455a, this.f18457c, Boolean.valueOf(this.e), Boolean.valueOf(this.f18458f));
    }
}
