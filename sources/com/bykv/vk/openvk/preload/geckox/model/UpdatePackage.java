package com.bykv.vk.openvk.preload.geckox.model;

import com.applovin.sdk.AppLovinEventTypes;
import com.bykv.vk.openvk.preload.a.a.c;
import com.mbridge.msdk.foundation.entity.o;
import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class UpdatePackage {
    private String accessKey;

    @c(a = "channel")
    private String channel;

    @c(a = "channel_index")
    private int channelIndex;

    @c(a = AppLovinEventTypes.USER_VIEWED_CONTENT)
    private Content content;

    @c(a = "group_name")
    private String groupName;
    private long localVersion;

    @c(a = "package_type")
    private int packageType;

    @c(a = "package_version")
    private long version;

    /* loaded from: classes.dex */
    public static class Content {

        @c(a = "package")
        private Package fullPackage;

        @c(a = "patch")
        private Package patch;

        @c(a = "strategies")
        private Strategy strategy;
    }

    /* loaded from: classes.dex */
    public static final class FileType {
        public static final int COMPRESSED_FILE = 0;
        public static final int MY_ARCHIVE_FILE = 2;
        public static final int UNCOMPRESSED_FILE = 1;
    }

    /* loaded from: classes.dex */
    public static class Package {

        @c(a = "id")
        long id;

        @c(a = "size")
        long length;

        @c(a = "md5")
        String md5;

        @Deprecated
        String url;

        @c(a = "url_list")
        List<String> urlList;

        public Package() {
        }

        public long getId() {
            return this.id;
        }

        public long getLength() {
            return this.length;
        }

        public String getMd5() {
            return this.md5;
        }

        public String getUrl() {
            return this.url;
        }

        public List<String> getUrlList() {
            return this.urlList;
        }

        public void setId(int i9) {
            this.id = i9;
        }

        public void setMd5(String str) {
            this.md5 = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setUrlList(List<String> list) {
            this.urlList = list;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Package{url='");
            sb.append(this.url);
            sb.append("', md5='");
            return AbstractC2914a.h(sb, this.md5, "'}");
        }

        public Package(int i9, List<String> list, String str) {
            this.id = i9;
            this.urlList = list;
            this.md5 = str;
        }
    }

    /* loaded from: classes.dex */
    public static class Strategy {

        @c(a = "del_if_download_failed")
        private boolean deleteIfFail;

        @c(a = "del_old_pkg_before_download")
        private boolean deleteOldPackageBeforeDownload;

        @c(a = "need_unzip")
        private boolean needUnzip;

        public Strategy(int i9) {
            this.deleteIfFail = i9 == 1;
        }

        public boolean isDeleteIfFail() {
            return this.deleteIfFail;
        }

        public boolean isDeleteOldPackageBeforeDownload() {
            return this.deleteOldPackageBeforeDownload;
        }

        public boolean isNeedUnzip() {
            return this.needUnzip;
        }

        public void setDeleteIfFail(boolean z8) {
            this.deleteIfFail = z8;
        }

        public void setDeleteOldPackageBeforeDownload(boolean z8) {
            this.deleteOldPackageBeforeDownload = z8;
        }

        public void setNeedUnzip(boolean z8) {
            this.needUnzip = z8;
        }
    }

    public UpdatePackage() {
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getChannel() {
        return this.channel;
    }

    public int getChannelIndex() {
        return this.channelIndex;
    }

    public Package getFullPackage() {
        return this.content.fullPackage;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public long getLocalVersion() {
        return this.localVersion;
    }

    public int getPackageType() {
        return this.packageType;
    }

    public Package getPatch() {
        return this.content.patch;
    }

    public Strategy getStrategy() {
        return this.content.strategy;
    }

    public long getVersion() {
        return this.version;
    }

    public boolean isFullUpdate() {
        if (getFullPackage() != null && getFullPackage().getUrlList().size() > 0) {
            return true;
        }
        return false;
    }

    public boolean isPatchUpdate() {
        if (getPatch() != null && getPatch().getUrlList().size() > 0) {
            return true;
        }
        return false;
    }

    public void setAccessKey(String str) {
        this.accessKey = str;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setChannelIndex(int i9) {
        this.channelIndex = i9;
    }

    public void setFullPackage(Package r22) {
        this.content.fullPackage = r22;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setLocalVersion(long j7) {
        this.localVersion = j7;
    }

    public void setPatch(Package r22) {
        this.content.patch = r22;
    }

    public void setStrategy(Strategy strategy) {
        this.content.strategy = strategy;
    }

    public void setVersion(long j7) {
        this.version = j7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UpdatePackage{version=");
        sb.append(this.version);
        sb.append(", channel='");
        sb.append(this.channel);
        sb.append("', content=");
        sb.append(this.content);
        sb.append(", packageType=");
        return o.l(sb, this.packageType, '}');
    }

    public UpdatePackage(long j7, String str, Package r42, Package r52) {
        this.version = j7;
        this.channel = str;
        Content content = new Content();
        this.content = content;
        content.fullPackage = r42;
        this.content.patch = r52;
    }
}
