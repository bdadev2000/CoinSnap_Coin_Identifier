package rc;

import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes3.dex */
public final class b extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public Map f24075b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f24076c;

    /* renamed from: d, reason: collision with root package name */
    public d f24077d;

    /* renamed from: f, reason: collision with root package name */
    public Mutex f24078f;

    /* renamed from: g, reason: collision with root package name */
    public Map f24079g;

    /* renamed from: h, reason: collision with root package name */
    public Object f24080h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f24081i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f24082j;

    /* renamed from: k, reason: collision with root package name */
    public int f24083k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(continuation);
        this.f24082j = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24081i = obj;
        this.f24083k |= Integer.MIN_VALUE;
        return this.f24082j.b(this);
    }
}
