package a4;

import com.google.android.gms.ads.rewarded.RewardItem;

/* loaded from: classes.dex */
public final class k implements RewardItem {

    /* renamed from: b, reason: collision with root package name */
    public String f150b;

    /* renamed from: c, reason: collision with root package name */
    public int f151c;

    public /* synthetic */ k(j jVar) {
        this.f150b = "";
    }

    public final l a() {
        l lVar = new l();
        lVar.a = this.f151c;
        lVar.f152b = this.f150b;
        return lVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        return this.f151c;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        return this.f150b;
    }

    public k(int i10, String str) {
        this.f151c = i10;
        this.f150b = str;
    }

    public k(Object obj) {
        this.f150b = "vungle";
        this.f151c = 1;
    }
}
