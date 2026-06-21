package mods.activity.update

import mods.net.proto.UpdateProto

object BluecordUpdater {
    
    fun parseUpdateInfo(data: ByteArray): UpdateProto.UpdateInfo {
        return UpdateProto.UpdateInfo.parseFrom(data)
    }
    
    fun checkForUpdate(response: UpdateProto.PollResponse): Boolean {
        return response.hasUpdate && response.hasUpdateInfo
    }
    
    fun getUpdateVersion(updateInfo: UpdateProto.UpdateInfo): String {
        return updateInfo.version
    }
}
