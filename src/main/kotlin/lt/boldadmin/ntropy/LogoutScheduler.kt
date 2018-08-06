package lt.boldadmin.ntropy

import lt.boldadmin.nexus.service.worklog.WorkLogService
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class LogoutScheduler(private val workLogService: WorkLogService) {

    @Scheduled(cron = "*/3 * * * * *")
    fun schedule() {
        workLogService.logout()
    }
}