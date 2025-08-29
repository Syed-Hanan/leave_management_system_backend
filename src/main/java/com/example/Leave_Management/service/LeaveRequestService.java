package com.example.Leave_Management.service;

import com.example.Leave_Management.entity.LeaveRequest;
import java.util.List;

public interface LeaveRequestService {
    LeaveRequest applyLeave(LeaveRequest request);                     // Employee applies leave
    List<LeaveRequest> getLeaveHistory(String empId);                  // Employee/Manager view leave history
    LeaveRequest approveLeave(Long leaveId, String managerId, String remarks); // Manager approves leave
    LeaveRequest rejectLeave(Long leaveId, String managerId, String remarks);  // Manager rejects leave
    LeaveRequest withdrawLeave(Long leaveId, String empId);            // Employee withdraw leave
    LeaveRequest cancelLeave(Long leaveId, String empId);              // Employee cancels approved leave
    List<LeaveRequest> getLeavesByManager(String managerId);           // Manager views all requests under him
}
